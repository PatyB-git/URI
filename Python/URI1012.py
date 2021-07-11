valores = input().split()
A = float(valores[0])
B = float(valores[1])
C = float(valores[2])


#a) a área do triângulo retângulo que tem A por base e C por altura.

triangulo = float((A*C)/2)

#b) a área do círculo de raio C. (pi = 3.14159)

circulo = float(3.14159 * (C**2))

#c) a área do trapézio que tem A e B por bases e C por altura.

trapezio = float(((A+B)*C)/2)

#d) a área do quadrado que tem lado B.

quadrado = float(B**2)

#e) a área do retângulo que tem lados A e B.

retangulo = float(A*B)

print(f"TRIANGULO: {triangulo:.3f}")
print(f"CIRCULO: {circulo:.3f}")
print(f"TRAPEZIO: {trapezio:.3f}")
print(f"QUADRADO: {quadrado:.3f}")
print(f"RETANGULO: {retangulo:.3f}")
