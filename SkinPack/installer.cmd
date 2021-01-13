

If not exist "%SystemDrive%\skinpack\Install.log" (
goto patch
)

:check
"W7Patcher_x86.exe" -PBIN3
"W7Patcher_x86.exe" -PBIN7
"W7Patcher_x86.exe" -V "%SystemDrive%\W7P_Backups\SkinPack_backup" -P "Resources" -LOG "%SystemDrive%\skinpack\Check.log"
exit
:patch
"W7Patcher_x86.exe" -PBIN3
"W7Patcher_x86.exe" -PBIN7
"W7Patcher_x86.exe" -P "Resources" -BN "SkinPack_backup" -LOG "%SystemDrive%\skinpack\Install.log"

exit
