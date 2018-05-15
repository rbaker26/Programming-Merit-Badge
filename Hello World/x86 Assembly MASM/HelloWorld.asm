.486
    .model flat, stdcall
    .stack 100h
    option casemap :none

    ExitProcess   PROTO Near32 stdcall, dwExitCode:dword
    putch         PROTO Near32 stdcall, bChar:byte;                           

.data
    strMyString byte "Hello World",0
.code
main PROC
    mov ecx, LENGTHOF strMyString
    mov esi, OFFSET strMyString
L1:
    invoke putch, byte PTR esi
    inc esi
    loop L1
    invoke ExitProcess,0
main ENDP
END main