linha01 = input().split()

codigo01 = int(linha01[0])
numPecas01 = int(linha01[1])
valorUnitario01 = float(linha01[2])

linha02 = input().split()

codigo02 = int(linha02[0])
numPecas02 = int(linha02[1])
valorUnitario02 = float(linha02[2])

valorTotal = float((numPecas01*valorUnitario01) + (numPecas02*valorUnitario02))

print(f"VALOR A PAGAR: R$ {valorTotal:.2f}")