class MonoAlphabetic {
    public static char[] PlainText = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
    

    public static char[] CodeText = { 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O',
            'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K',
            'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M','q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm' };

    public static String Encryption(String s)
    {
        String encryptedText = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 52; j++) {

                if (s.charAt(i) == PlainText[j])
                {
                    encryptedText += CodeText[j];
                    break;
                }

                if (s.charAt(i) < 'A' || s.charAt(i) > 'z')
                {
                    encryptedText += s.charAt(i);
                    break;
                }
            }
        }

        return encryptedText;
    }

    public static String Decryption(String s)
    {

        String decryptedText = "";

        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 0; j < 52; j++) {

                if (s.charAt(i) == CodeText[j])
                {
                    decryptedText += PlainText[j];
                    break;
                }

                if (s.charAt(i) < 'Q' || s.charAt(i) > 'z')
                {
                    decryptedText += s.charAt(i);
                    break;
                }
            }
        }

        return decryptedText;
    }
    public static void main(String[] args)
    {
        String text = "Hcssi Bidsm";

        System.out.println("Plain text: " + text);

        System.out.println("Encrypted text: "
                + text);

        System.out.println("Decrypted text: "
                + Decryption(text));
    }
}
