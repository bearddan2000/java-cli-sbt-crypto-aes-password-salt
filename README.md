# java-cli-sbt-crypto-aes-password-salt

## Description
A demo for AES encryption of a password.
AES is a 256 byte encryption. SALT is the
mixing of the original text with a secret key.
It is considered more secure to store the
SALT then the encrypted original text, however
this can still be cracked with rainbow tables.

## Tech stack
- java
- sbt

## Docker stack
- hseeberger/scala-sbt:11.0.2-oraclelinux7_1.3.5_2.12.10

## To run
`sudo ./install.sh -u`

## To stop (optional)
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credits
https://www.baeldung.com/java-aes-encryption-decryption
