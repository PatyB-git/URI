idadeDias = int(input())

anos = idadeDias//365
idadeDias = idadeDias - (anos*365)

meses = idadeDias//30
idadeDias = idadeDias - (meses*30)

dias = idadeDias

print("%s ano(s)" %(anos))
print("%s mes(es)" %(meses))
print("%s dia(s)" %(dias))
