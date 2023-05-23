# JDK WhiteBox

WhiteBox is compiled with JDK 21, therefore you need to have JDK 21 for execution the commands;

```
sdk use java 21.ea.23-open
```

Run:

```
$ java -cp wb.jar -Xbootclasspath/a:wb.jar -XX:+UnlockDiagnosticVMOptions -XX:+WhiteBoxAPI -XX:-BackgroundCompilation -XX:CompileCommand="print *.hello" src/ImmediateC1Compilation.java

CompileCommand: print *.hello bool print = true

============================= C1-compiled nmethod ==============================
----------------------------------- Assembly -----------------------------------
[0.661s][warning][os] Loading hsdis library failed

Compiled method (c1)     660 1440       1       ImmediateC1Compilation::hello (7 bytes)
 total in heap  [0x000000011247f290,0x000000011247f590] = 768
 relocation     [0x000000011247f3e0,0x000000011247f408] = 40
 main code      [0x000000011247f440,0x000000011247f4d0] = 144
 stub code      [0x000000011247f4d0,0x000000011247f518] = 72
 oops           [0x000000011247f518,0x000000011247f520] = 8
 metadata       [0x000000011247f520,0x000000011247f530] = 16
 scopes data    [0x000000011247f530,0x000000011247f548] = 24
 scopes pcs     [0x000000011247f548,0x000000011247f588] = 64
 dependencies   [0x000000011247f588,0x000000011247f590] = 8

[Constant Pool (empty)]

[MachCode]
[Verified Entry Point]
  # {method} {0x0000000126ac1540} 'hello' '(Ljava/lang/String;)Ljava/lang/String;' in 'ImmediateC1Compilation'
  # parm0:    c_rarg1:c_rarg1
                        = 'java/lang/String'
  #           [sp+0x30]  (sp of caller)
  0x000000011247f440: 1f20 03d5 | e953 40d1 | 3f01 00f9 | ffc3 00d1 | fd7b 02a9 | 2801 0018 | 8923 40b9 | 1f01 09eb
  0x000000011247f460: e000 0054 | 0820 85d2 | 083d a2f2 | 2800 c0f2 | 0001 3fd6 | 0200 0014 | 0000 0000

  0x000000011247f47c: ; ImmutableOopMap {c_rarg1=Oop }
                      ;*invokedynamic {reexecute=0 rethrow=0 return_oop=0}
                      ; - ImmediateC1Compilation::hello@1 (line 15)
                      ;   {runtime_call load_appendix_patching Runtime1 stub}
  0x000000011247f47c: a1c4 eb97

  0x000000011247f480: ; ImmutableOopMap {}
                      ;*invokedynamic {reexecute=0 rethrow=0 return_oop=0}
                      ; - ImmediateC1Compilation::hello@1 (line 15)
                      ;   {static_call}
  0x000000011247f480: 0084 e897

  0x000000011247f484: ;   {other}
  0x000000011247f484: 1f20 03d5 | 9f3e 80f2 | 1f20 80f2 | fd7b 42a9 | ffc3 0091

  0x000000011247f498: ;   {poll_return}
  0x000000011247f498: 8827 42f9 | ff63 28eb | 4800 0054 | c003 5fd6

  0x000000011247f4a8: ;   {internal_word}
  0x000000011247f4a8: 88ff ff10 | 8833 02f9

  0x000000011247f4b0: ;   {runtime_call SafepointBlob}
  0x000000011247f4b0: 549c e817 | 807f 42f9 | 9f7f 02f9 | 9f83 02f9 | fd7b 42a9 | ffc3 0091

  0x000000011247f4c8: ;   {runtime_call unwind_exception Runtime1 stub}
  0x000000011247f4c8: 8ea8 eb17 | 0000 0000
[Stub Code]
  0x000000011247f4d0: ;   {no_reloc}
  0x000000011247f4d0: df3f 03d5

  0x000000011247f4d4: ;   {metadata(nullptr)}
  0x000000011247f4d4: 0c00 80d2 | 0c00 a0f2 | 0c00 c0f2 | 0800 80d2 | 0800 a0f2 | 0800 c0f2 | 0001 1fd6

  0x000000011247f4f0: ;   {trampoline_stub}
  0x000000011247f4f0: 4800 0058 | 0001 1fd6 | 8004 ea11 | 0100 0000
[Exception Handler]
  0x000000011247f500: ;   {runtime_call handle_exception_from_callee Runtime1 stub}
  0x000000011247f500: 40b7 eb97 | c1d5 bbd4 | accf 0b02 | 0100 0000
[Deopt Handler Code]
  0x000000011247f510: 1e00 0010

  0x000000011247f514: ;   {runtime_call DeoptimizationBlob}
  0x000000011247f514: 0b9d e817
[/MachCode]
Hello Petr
```
