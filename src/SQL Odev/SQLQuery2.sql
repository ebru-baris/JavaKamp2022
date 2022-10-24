--SELECT
-- Case insensitive : büyük küçük harf duyarsız

-- Customers tablosundan bütün sütunları getirmek için
Select * from Customers

--Customers tablosundan sadece istenen sütunları getirmek için 
Select ContactName, CompanyName, City from Customers

--Customers tablosundan getirdiğimiz sütunlara istediğimiz ismi atamak için
Select ContactName Adi, CompanyName Sirketadi, City Sehir from Customers

--Customers tablosundan City sütunundaki değeri london olanların sütunlarını getirmek için
Select * from Customers where City='London'

--Products tablosundan categoryId si 1 YA DA 3 olanları getir
Select * from Products where categoryID=1 or categoryID=3

--Products tablosundan categoryId si 1 olanlar VE UnitPrice sı 10 dan büyük olanların sütunlarını getirmek için
Select * from Products where categoryID=1 and UnitPrice>10
-- Burada <10 (küçüktür 10), >=10 (büyük eşittir 10) ya da <>10 (10 dan farklıdır) şeklinde yazılabilir

--Products tablosundaki categoryId ye göre sıralama yapmak için 
Select * from Products order by categoryID

--Products tablosunu öncelikle categoryId e göre sıralayıp(1,2,3,...) sonra kendi içinde ProductName e göre(a,b,c,...) sıralamak için
Select * from Products order by CategoryId,ProductName

--Products tablosundaki ürünleri UnitPrice a göre en ucuzdan başlayarak sıralamak için 
Select * from Products order by UnitPrice asc

--Products tablosundaki CategoryId si 1 olanları filtreleyip fiyata göre azalan olarak getirmek için
Select * from Products where categoryID=1 order by UnitPrice desc

--Products tablosunda kaç ürün var bulmak için
Select count(*) from Products

--PRoducts tablosunda CategoryID si 2 olan kaç ürün var bulmak için
Select count(*) from Products where categoryID=2

--Bütün kategorileri tekrar etmeyecek şekilde listelemek için 
Select categoryID from Products group by CategoryId

--hangi kategoride kaç ürün var 
Select categoryId, count(*) from products group by categoryId

--Ürün sayısı 10 dan küçük olan kategorileri listelemek için (Burada having - where koşulu ile aynıdır fakat count için kullanılır)
Select categoryId, count(*) from products group by categoryId having count(*) <10 

--Birim fiyatı 20 den fazla olan ürünleri categoryId e göre grupla, onlardan da ürün sayısı 10 dan küçük olanları getirmek için(önce where çalışır)
Select categoryId,count(*) from products where UnitPrice>20 group by categoryId having count(*) <10

--CategoryId ler eşitse hangi ürün hangi kategoride gösterir(iki farklı tabloyu categoryId sayesinde birleştireceğiz)
Select * from Products inner join Categories on Products.CategoryID = categories.CategoryID

-- burada * yerine istediğimiz sütunları belirtebiliriz
Select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName from Products inner join Categories on Products.CategoryID = categories.CategoryID

--Birim fiyatı 10 dan büyük olanları kategori ismi ile getirir(Yukarıdaki işleme yeni bir koşul ekledik)
Select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName from Products inner join Categories on Products.CategoryID = categories.CategoryID where Products.UnitPrice>10


--DTO Data Transformation Object 
--İnner join aynı olan(eşleşen) ürünleri getirdi. Karşılığı olmayan ürünleri bulmak için 

-- Solda olup sağda olmayan ürünleri listelemek istersek(ürünlerde olup satışı olmayan ürünler var mı bakıyoruz)
Select * from Products p left join [Order Details] od on p.ProductID=od.ProductID 

--İnner join kullanarak müşteri olup sipariş kısmında bilgisi bulunanları getirdik
Select * from Customers c inner join Orders o on c.CustomerId =o.CustomerId
-- left join kullanarak müşteri olup henüz sipariş vermemiş kişilerin bilgisini de ekledik(2 kişi)
Select * from Customers c left join Orders o on c.CustomerId =o.CustomerId

-- sisteme kayıt olup hiç alışveriş yapmamış olan kişileri bulmak için kullanılır bu yöntem
Select * from Customers c left join Orders o on c.CustomerId =o.CustomerId where o.customerId is null

-- left inner kullanımında ( Orders o right join custemers c ) şeklindede kullanılabilir ama genelde sol olan tercih edilir.

-- birden fazla birleştirme yapabiliriz 
Select * from Products p inner join [Order Details] od on p.ProductID=od.ProductID inner join Orders o on o.orderId=od.orderID
