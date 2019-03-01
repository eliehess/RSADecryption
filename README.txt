This program uses 300-bit RSA to decrypt messages encrypted with the corresponding encryption program. If you're looking at this on GitHub and it's called "RSADecryption", the encryption program should be called "RSAEncryption". A very creative name, I know.

One of the main advantages of RSA is that even with access to the encryption key, it should be exceedingly difficult to derive the decryption key. Thus, the encryption key can be handed out publicly while keeping the decryption key private.

To run the program, you need an encrypted file named "bomb.kgb" located in the same directory as the program.