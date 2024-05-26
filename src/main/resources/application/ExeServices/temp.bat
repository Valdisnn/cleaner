@echo off
setlocal

echo.
echo Cleaning up temporary files...

del /f /s /q "%TEMP%\*"
del /f /s /q "%SystemRoot%\Temp\*"
del /f /s /q "%SystemRoot%\System32\Temp\*"
del /f /s /q "%SystemRoot%\ServiceProfiles\NetworkService\AppData\Local\Temp\*"
del /f /s /q "%SystemRoot%\ServiceProfiles\LocalService\AppData\Local\Temp\*"

echo.
echo Cleanup complete.
echo Press any key to continue...
pause > nul
