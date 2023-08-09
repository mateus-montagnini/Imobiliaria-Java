package com.imobiliaria.classes;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Aluguel apto1 = new Aluguel("Rua Silvia, 32", LocalDate.now(), 1800);
        System.out.println("Endereco: " + apto1.getEndereco());
        System.out.println("Valor do Aluguel: " + apto1.getValorAluguel());

        Venda apto2 = new Venda("Rua Marcos Paulo, 152", LocalDate.now(), 250000);
        System.out.println("Endereco: " + apto2.getEndereco());
        System.out.println("Valor da Venda: " + apto2.getValorVenda());

        apto1.ativarCadastro();

        apto1.alugar();
        System.out.println(apto1.isAlugado());
    }
}
