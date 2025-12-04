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
    
    /**
     * Valida un IBAN español (24 caracteres, empieza por ES).
     * @param iban El IBAN a validar.
     * @return true si es válido, false en caso contrario.
     */
    public boolean validarIban(String iban) {
        if (!tieneFormatoBasicoValido(iban)) {
            return false;
        }

        String ibanLimpio = iban.replaceAll("\\s+", "").toUpperCase();
        String reorganizado = moverPrimeros4AlFinal(ibanLimpio);
        String soloNumeros = convertirLetrasANumeros(reorganizado);
        return calcularModulo97(soloNumeros) == 1;
    }
}
