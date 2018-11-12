print("¿Cual es tu edad?")
iEdad = int(input())
print("¿Tienes tu INE?")
bTieneINE = (input().lower == 'true')
if iEdad >= 18 and bTieneINE == True:
    print("Puedes entrar al antro")
else:
    print("¡Saquese de aqui!")
