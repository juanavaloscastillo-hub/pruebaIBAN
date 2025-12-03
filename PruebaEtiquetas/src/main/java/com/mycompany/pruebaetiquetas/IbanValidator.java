/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaetiquetas;

/**
 *
 * @author juand
 */
public class IbanValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IbanValidator validator = new IbanValidator();
        String respuesta;

        do {
            System.out.print("Introduce tu IBAN (ej: ES9121000418450200051332): ");
            String iban = sc.nextLine();

            if (validator.validarIban(iban)) {
                System.out.println("✅ El IBAN es válido.");
            } else {
                System.out.println("❌ El IBAN no es válido.");
            }
}
