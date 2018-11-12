iAnnio = 1996
iResi4 = iAnnio % 4
iResi100 = iAnnio % 100
iResi400 = iAnnio % 400
if iResi4 == 0 and (not iResi100 == 0 and iResi400 == 0):
    print("Año bisiesto")
else:
    print("Año no bisiesto")
