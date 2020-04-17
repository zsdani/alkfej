# Alkalmazások fejlesztése

Alkalmazások fejlesztése
Ez egy egyszerűbb „mini neptun” oldal.
Neptun kód és jelszó beírása után hallgatóként vagy adminként be tudunk lépni. Bejelentkezés nélkül csak vendég vagy.



<h3>1. Tagok által elérhető funkciók</h3>

<p>Diákként:</p>
<ul>
   <li>meg tudjuk tekinteni az adatainkat.(Név, felvett tárgyak,felvett kredit, saját adatok, stb…)</li>
   <li>megtekinthetjük a felvett tárgyainkat ahol láthatóak a tárgy adatai</li>
   <li>Tárgyakat tudunk felvenni</li>
  <li>Tárgyakat tudunk leadni</li>
</ul>

      
<p>Adminként:</p>    
<ul>
   <li>létre tud hozni új tárgyat, épületet</li>
   <li>törölni tud tárgyat, épületet, usert</li>
   <li>épülethez hozzá tud adni tárgyat</li>   
   
</ul>
      
<p>Vendégként:</p>         
<ul>
   <li>a bejelentkezési oldal megtekintése</li>
</ul>

<h3>2.  Funkcionális elvárások</h3>

<ul>
   <li>Belépés</li>
   <li>tanulók kilistázása tárgyanként</li>
   <li>összes létező tárgy kilistázása</li>
   <li>tanuló saját tárgyainak listázása</li>
   <li>kurzusok listázása épületenként</li>
   <li>épületek listája</li>
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
   <li>admin: rendelkezik belépéshez szükséges adatokkal, saját adatait tudja megtekinteni és módosítani, illetve tárgyat, épületet hozzáadni az adatbázishoz, törölni.</li>
</ul>


<h3>5. Szakterületi fogalomjegyzék</h3>
<ul>
   <li>kredit: egy szám, ami a tárgy nehézségének függvényében egyre nagyobb</li>
</ul>



<h3>Adatbázis terv:</h3>

![entities](https://user-images.githubusercontent.com/47753407/79592394-3b0aa280-80da-11ea-9c29-c328260ec778.png)


<h3>Végpontok</h3y
<ul>
   <li> GET / Főoldal</li> 
   <li>GET /login Bejelentkező oldal</li>
   <li>POST /login Bejelentkezés</li>
   <li>GET /logout Kijelentkezés</li>
   
   <li>GET /persons Felhasználók kilistázása</li>
   <li>GET /persons/:id Felhasználó adatainak megjelenítése</li>
   <li>GET /persons/:id/subjects Felhasználóhoz tartozó tárgyak listázása
   <li>PUT /persons/:id Felhasználó módosítása</li>
   <li>POST /persons Új Felhasználó felvétele</li>
   <li>POST /persons/:id/subjects Tantárgy felvétele felhasználóhoz</li>
   <li> DELETE /persons/:id Felhasználó törlése</li>
   
   <li>GET /subjects Tantárgyak kilistázása</li>
   <li>GET /subjects/:id Tantárgy adatainak megjelenítése</li>
   <li>POST /subjects Új tantárgy felvétele</li>
   <li>GET /subjects/:id/persons Tantárgyhoz tartózó felhasználók kilistázása</li>
   <li>PUT /subjects/:id Tantárgy módosítása</li>
   <li> DELETE /subjects/:id Tantárgy törlése </li>
   
   <li>GET /buildings Épületek listázása</li>
   <li>GET /buildings/:id Épület adatainak megjelenítése</li>
   <li>GET /buildings/:id/subjects Épülethez tartozó tárgyak listázása</li>
   <li>PUT /buildings/:id/subjects Épület adatainak módosítása</li>
   <li>POST /buildings Épület hozzáadása</li>
   <li>POST /buldings/:id/subjects Tárgy hozzáadása épülethez</li>
   <li>DELETE /buildings/:id Épület törlése</li>
</ul>

<h3>Szekvencia diagram</h3>
![neptunapp](https://user-images.githubusercontent.com/47753407/79596514-0221fc00-80e1-11ea-93fe-890b7932fecb.png)



<h3>Fejlesztői környezet</h3>

Használt technológiák: JAVA Spring, hibernate, Maven, H2 Database, Lombok, Spring Security, Angular 8.3.5, Bootstrap

 <ul>
   <li> Backend: IntelliJ IDEA </li>
</ul>
    
<h3>Könyvtárstruktúra:</h3>
![konyvtar](https://user-images.githubusercontent.com/47753407/79596229-79a35b80-80e0-11ea-9c95-9946a8226c47.png)
    
    
   
  
   






