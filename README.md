# Metode i tehnike testiranja programske podrške - projektni zadatak
---
U ovom projektnom zadataku napravljen je automatski test [webshopa](http://saucedemo.com) koji se može izvoditi na 3 podržana browsera: Google Chrome, Firefox i Safari. U projektu su primjenjene značajke poput: **Object Model(POM), WebDriverManager, Cross-Browser testing, Reporting tests and Parallel Testing**

## Popis alata koji su potrebni za izvođenje testa:
---
- [IntelliJ - IDE](https://www.jetbrains.com/idea/download/#section=mac)
- [JDK(Java Development Kit)](https://www.guru99.com/install-java.html)
- [Selenium Java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)
- [TestNG - Test Framework](https://mvnrepository.com/artifact/org.testng/testng)
- [WebDriverManager](https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager)

## Pokretanje testa
---
1. Skinuti jedan od 3 podržana browsera
2. Instalirati potrebne dependency-ije
3. Pokrenuti test iz komandne linije
`> mvn test (cmd + enter/ ctrl + enter)`
4. U index.html koji se nalazi u `UITest/target/surefire-reports/index.html` možemo vidjeti report odrađenih testova

## Testni slučajevi
---
Testni slučajevi koji su obrađeni u ovom projektnom zadatku su ovisni jedni o drugima zato što se međusobno nastavljaju jedan na drugi
1. [VerifyPageTitle](https://github.com/lvuk/UITest/blob/main/src/test/java/TestMethods.java) - provjera da li je početna stranica browser-a Google.com
2. [Search](https://github.com/lvuk/UITest/blob/main/src/test/java/TestMethods.java) - provjera pronalaženja webshopa na google-u
3. [VerifyLogin](https://github.com/lvuk/UITest/blob/main/src/test/java/TestMethods.java) - provjera login-a 
4. [FillTheCart](https://github.com/lvuk/UITest/blob/main/src/test/java/TestMethods.java) - provjera dodavanja stvari u košaricu
5. [RemoveOneItemFromCart](https://github.com/lvuk/UITest/blob/main/src/test/java/TestMethods.java) - provjera izbacivanja stvari iz košarice
6. [ProceedWithOrder](https://github.com/lvuk/UITest/blob/main/src/test/java/TestMethods.java) - provjera da li je narudžba izvršena
