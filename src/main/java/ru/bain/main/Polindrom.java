package ru.bain.main; // Проверить является ли заданная строка полиндромом, т.е читается одинаково слева направо и справа налево.

public class Polindrom {
    public static void main(String[] args) {
        isPalindrome("Madam, I'm Adam!");
    }

    public static boolean isPalindrome(String text) {
        String newText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String text2 = new StringBuilder(newText).reverse().toString();
        boolean result = newText.equals(text2);
        System.out.println(result);
        return result;
    }
}
