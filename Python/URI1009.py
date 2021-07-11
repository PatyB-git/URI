nome = input()
salarioFixo = float(input())
vendasMes = float(input())

total = salarioFixo + (vendasMes*0.15)

print(f"TOTAL = R$ {total:.2f}")