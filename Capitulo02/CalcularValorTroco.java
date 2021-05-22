package Capitulo02;

import java.util.Scanner;
/*
 * Programa para calcular troco.
 */

public class CalcularValorTroco {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();

		System.out.print("Digite o valor pago pelo cliente: ");
		Double valorPagoCliente = scanner.nextDouble();

		Double valorTroco = valorPagoCliente - valorProduto;
		System.out.printf(String.format("Troco do cliente: R$ %.2f\n", valorTroco).replace(".", ","));

		scanner.close();
	}

}
