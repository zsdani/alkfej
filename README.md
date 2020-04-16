# Alkalmazások fejlesztése

Alkalmazások fejlesztése
Ez egy egyszerűbb „mini neptun” oldal.
Neptun kód és jelszó beírása után hallgatóként vagy tanárként be tudunk lépni. Bejelentkezés nélkül csak vendég vagy.



<h3>1. Tagok által elérhető funkciók</h3>

<p>Diákként:</p>
<ul>
   <li>meg tudjuk tekinteni az adatainkat.(Név, felvett tárgyak,felvett kredit, saját adatok, stb…)</li>
   <li>megtekinthetjük a felvett tárgyainkat ahol látható a tárgy kód, végleges jegy, kredit, teljesítette vagy sem</li>
   <li>Tárgyakat tudunk felvenni</li>
  <li>Tárgyakat tudunk leadni</li>
</ul>

      
<p>Tanárként:</p>    
<ul>
   <li> meg tudjuk tekinteni az adatainkat.(Név, oktatott tárgyak, saját adatok, stb…)</li>
   <li>beírhat jegyet</li>
   <li> hozzá tud adni új tárgyat</li>
  <li>tud törölni tárgyakat (sajátját)</li>
</ul>
      
<p>Vendégként:</p>         
<ul>
   <li>a bejelentkezési oldal megtekintése</li>
</ul>

<h3>2.  Funkcionális elvárások</h3>

<ul>
   <li>Belépés</li>
   <li>tanulók ki listázása tárgyanként</li>
   <li>saját felvett tárgyak ki listázása</li>
  <li>saját tanított tárgyak ki listázása</li>
</ul>
              
<h3>3. Nem funkcionális elvárások</h3>       
<ul>
   <li>Felhasználóbarát, egyszerű, letisztult felület</li>
   <li>Jelszó Neptun kód páros biztonságos tárolása</li>
   <li>logikus menü elrendezés</li>
</ul>

<h3>4. Szerepkörök</h3>
<ul>
   <li>vendég: nem rendelkezik belépéshez szükséges adatokkal, csak a belépő felületet tudja megtekinteni.</li>
   <li>diák: rendelkezik belépéshez szükséges adatokkal, saját adatait tudja megtekinteni és módosítani, illetve tárgyat felvenni, leadni.</li>
   <li>tanár: rendelkezik belépéshez szükséges adatokkal, saját adatait tudja megtekinteni és módosítani, illetve tárgyat hozzáadni az adatbázishoz, törölni.</li>
</ul>


<h3>5. Szakterületi fogalomjegyzék</h3>
<ul>
   <li>kredit: egy szám, ami a tárgy nehézségének függvényében egyre nagyobb</li>
</ul>



<h3>6. Adatbázis terv:</h3>

![entities](https://user-images.githubusercontent.com/47753407/78537469-d3a64600-77ef-11ea-9cc4-3181fa43464c.png)

<h3>7. Fejlesztőkörnyezet: InteliJ</h3>
Github account nem szükséges, de hasznos
Hozzunk létre egy munkakönyvtárat
node.js-el töltsük le az adonisJS-t
adonissJS hozzuk létre a fejlesztő környezetet
Ezen a munkaterületen elkezdhetünk kódolni
Miután végeztünk a munkával elmenthetjük lokálisan vagy github-ra
Githubrara úgy tudod commitolni, hogy job felső részen rámész a zöld nyilra, majd a megjelenő ablaknál kiválasztod a commitolni kívánt fájlokat. Pusholni meg a kék nyilra való kattintás után lehet.

<h3>8. Könyvtárstruktúra</h3>

Controllers
<ul>
   <li>ExamController</li>
   <li>SubjectController</li>
   <li>UserController</li>
</ul>
Models
<ul>
   <li>User</li>
   <li>Exam</li>
   <li>Subject</li>
</ul>

WebSecurityConfig

<h3>9. Végpontok</h3>
<ul>
   <li>GET  /login bejelentkezés </li>
   <li>GET /users  felhasználok kilistázása</li>
   <li>GET /user/id/  felhasználó információi   li>
   <li>GET /subjects  tárgyak kilistázása</li>
   <li>GET /exams  vizsgák kilistázása</li>
</ul>






