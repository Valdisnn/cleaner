@echo off
echo Network testing in progress...
echo.

REM Ping a list of IP addresses
echo Pinging IP addresses...
for %%i in (192.168.1.1 192.168.1.100 192.168.1.200) do (
  echo.
  echo Pinging %%i...
  ping -n 4 %%i
)
echo.

echo Network testing complete!
echo.
pause
