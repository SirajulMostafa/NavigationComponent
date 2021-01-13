'Unattended System Restore Point
'sysrestorepoint.vbs
'© Doug Knox - rev 02/06/2002
'This code may be freely distributed/modified
'Downloaded from www.dougknox.com 
'Extracted from original code by Bill James - www.billsway.com

Set sr = getobject("winmgmts:\\.\root\default:Systemrestore")

If (sr.createrestorepoint("SkinPack", 0, 100)) = 0 Then

End If

Set sr = Nothing