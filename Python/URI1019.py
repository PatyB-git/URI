nomeVendedor = input()
salarioFixo = float(input())
totalVendasDinheiro = float(input())

comissao = totalVendasDinheiro*0.15

print("TOTAL = R$ {0:.2f}" .format(salarioFixo+comissao))