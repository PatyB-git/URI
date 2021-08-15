tempoDuracao = int(input())

horas = tempoDuracao//3600
tempoDuracao = tempoDuracao%3600

minutos = tempoDuracao//60
tempoDuracao = tempoDuracao%60

print("{0}:{1}:{2}".format(horas,minutos,tempoDuracao))

