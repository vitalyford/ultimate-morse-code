# Ultimate Morse Code Assignment

In this assignment, you will decode a given morse code string without spaces in all possible ways.

For example, given a string `-.-`, your program should be able to generate the following decoded messages (in any order):
```
tet
ta
nt
k
```

# Morse Code Alphabet

Feel free to use the following arrays (we have not studied `HashMap` yet but if you know it, you can use that instead to store the alphabet characters and their corresponding representation of the morse codes). Here, `alphabet[0]` is represented as `morseCodes[0]`, `alphabet[1]` as `morseCodes[1]`, and so on.

```
String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
"k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
"w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
"9", "0"};

String[] morseCodes = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
"....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
"--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
"-.--", "--..", ".----", "..---", "...--", "....-", ".....",
"-....", "--...", "---..", "----.", "-----"};
```