valor = int(input())
print(valor)
notasCem = valor//100
valor = valor-(notasCem*100)

notasCinquenta = valor//50
valor = valor - (notasCinquenta*50)

notasVinte = valor//20
valor = valor - (notasVinte*20)

notasDez = valor//10
valor = valor - (notasDez*10)

notasCinco = valor//5
valor = valor - (notasCinco*5)

notasDois = valor//2
valor = valor - (notasDois*2)

print("%s nota(s) de R$ 100,00" %(notasCem))
print("%s nota(s) de R$ 50,00" %(notasCinquenta))
print("%s nota(s) de R$ 20,00" %(notasVinte))
print("%s nota(s) de R$ 10,00" %(notasDez))
print("%s nota(s) de R$ 5,00" %(notasCinco))
print("%s nota(s) de R$ 2,00" %(notasDois))
print("%s nota(s) de R$ 1,00" %(valor))