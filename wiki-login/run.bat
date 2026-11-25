@echo off

echo.
echo  ============================================
echo   BIT235 Wiki Administrator Login
echo   Starting server at http://localhost:8080/login
echo  ============================================
echo.

set "JAVA_HOME=C:\Program Files\Java\jdk-21.0.12.1"
set "PATH=%JAVA_HOME%\bin;%PATH%"

echo [1/2] Building project with Maven ...
call "%~dp0mvnw.cmd" -q -DskipTests package
if errorlevel 1 (
    echo.
    echo  BUILD FAILED - see errors above.
    pause
    exit /b 1
)

echo [2/2] Starting Spring Boot ...
echo.
echo  Open browser: http://localhost:8080/login
echo  Account: jingting / 123
echo  Press Ctrl+C to stop the server.
echo.
java -jar "%~dp0target\wiki-login-0.0.1-SNAPSHOT.jar"

pause
