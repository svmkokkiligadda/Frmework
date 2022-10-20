set projectLocation=C:\Users\hp\eclipse-workspace\Frame_batch25
 
cd %projectLocation%
 
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
 
java org.testng.TestNG %projectLocation%\testng.xml
 
pause
