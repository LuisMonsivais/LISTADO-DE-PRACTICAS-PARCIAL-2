print("Introduce tu calificacion")
iCalificacion = int(input())
if iCalificacion == 100:
    print("A")
else:
    if iCalificacion == 90:
        print("B")
    else:
        if iCalificacion == 80:
            print("C")
        else:
            if iCalificacion == 70:
                print("D")
            else:
                if iCalificacion == 60:
                    print("F")
                else:
                    print("Calificacion fuera de rango")
