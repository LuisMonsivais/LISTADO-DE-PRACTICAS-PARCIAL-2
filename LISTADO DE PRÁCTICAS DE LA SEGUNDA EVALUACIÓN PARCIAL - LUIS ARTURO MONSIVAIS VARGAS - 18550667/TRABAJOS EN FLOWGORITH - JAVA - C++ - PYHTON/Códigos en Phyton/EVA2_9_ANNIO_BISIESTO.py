print("Introduce el año")
iAnnio = int(input())
if iAnnio % 4 == 0:
    if not iAnnio % 100 == 0:
        if not iAnnio % 400 == 0:
            print("Año bisiesto")
        else:
            print("Año no bisiesto")
    else:
        print("Año bisiesto", end='', flush=True)
else:
    print("Año no bisiesto")
