numFuncionario = int(input())
horasTrabalhadas = int(input())
valorHora = float(input())

salary = float(horasTrabalhadas*valorHora)

print("NUMBER =", numFuncionario)
print(f"SALARY = U$ {salary:.2f}")