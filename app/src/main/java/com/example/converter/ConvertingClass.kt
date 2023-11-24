package com.example.converter

enum class LengthConvertingFun(val function: (Double) -> Double) {
    // sm
    SMtoSM({num: Double -> num}),
    SMtoDM(fun(num: Double): Double = num * 0.1),
    SMtoM(fun(num: Double): Double = num * 0.01),
    SMtoKM(fun(num: Double): Double = num * 0.00001),
    SMtoINCH(fun(num: Double): Double = num * 0.393701),
    SMtoYARD(fun(num: Double): Double = num * 0.0109361),
    SMtoMILE(fun(num: Double): Double = num * 6.21371e-6),

    //dm
    DMtoDM({num: Double -> num}),
    DMtoSM(fun(num: Double): Double = num * 10),
    DMtoM(fun(num: Double): Double = num * 0.1),
    DMtoKM(fun(num: Double): Double = num * 0.0001),
    DMtoINCH(fun(num: Double): Double = num * 3.93701),
    DMtoYARD(fun(num: Double): Double = num * 0.109361),
    DMtoMILE(fun(num: Double): Double = num * 6.21371e-5),

    //m
    MtoM({num: Double -> num}),
    MtoSM(fun(num: Double): Double = num * 100),
    MtoDM(fun(num: Double): Double = num * 10),
    MtoKM(fun(num: Double): Double = num * 0.001),
    MtoINCH(fun(num: Double): Double = num * 39.3701),
    MtoYARD(fun(num: Double): Double = num * 1.09361),
    MtoMILE(fun(num: Double): Double = num * 6.21371e-4),

    //km
    KMtoKM({num: Double -> num}),
    KMtoSM(fun(num: Double): Double = num * 100000),
    KMtoDM(fun(num: Double): Double = num * 10000),
    KMtoM(fun(num: Double): Double = num * 1000),
    KMtoINCH(fun(num: Double): Double = num * 39370.1),
    KMtoYARD(fun(num: Double): Double = num * 1093.61),
    KMtoMIlE(fun(num: Double): Double = num * 0.621371),

    //inch
    INCHtoINCH({num: Double -> num}),
    INCHtoSM(fun(num: Double): Double = num * 2.54),
    INCHtoDM(fun(num: Double): Double = num * 0.254),
    INCHtoM(fun(num: Double): Double = num * 0.0254),
    INCHtoKM(fun(num: Double): Double = num * 2.54e-5),
    INCHtoYARD(fun(num: Double): Double = num * 0.0277778),
    INCHtoMile(fun(num: Double): Double = num * 1.371491378e-5),

    //yard
    YARDtoYARD({num: Double -> num}),
    YARDtoSM(fun(num: Double): Double = num * 91.44),
    YARDtoDM(fun(num: Double): Double = num * 9.144),
    YARDtoM(fun(num: Double): Double = num * 0.914),
    YARDtoKM(fun(num: Double): Double = num * 0.000914),
    YARDtoINCH(fun(num: Double): Double = num * 36),
    YARDtoMILE(fun(num: Double): Double = num * 0.000493737),

    //mile
    MILEtoMILE({num: Double -> num}),
    MILEtoSM(fun(num: Double): Double = num * 185200),
    MILEtoDM(fun(num: Double): Double = num * 18520),
    MILEtoM(fun(num: Double): Double = num * 1852),
    MILEtoKM(fun(num: Double): Double = num * 1.852),
    MILEtoINCH(fun(num: Double): Double = num * 72913.4),
    MILEtoYARD(fun(num: Double): Double = num * 2025.37),
}

enum class WeightConvertingFun(val function: (Double) -> Double) {
    //mg
    MGtoMG({num: Double -> num}),
    MGtoG(fun(num: Double): Double = num * 0.001),
    MGtoKG(fun(num: Double): Double = num * 1e-6),
    MGtoT(fun(num: Double): Double = num * 1e-9),
    MGtoOUNCE(fun(num: Double): Double = num * 3.5274e-5),
    MGtoLB(fun(num: Double): Double = num * 2.20462500284e-6),

    //g
    GtoG({num: Double -> num}),
    GtoMG(fun(num: Double): Double = num * 1000),
    GtoKG(fun(num: Double): Double = num * 0.001),
    GtoT(fun(num: Double): Double = num * 1e-6),
    GtoOUNCE(fun(num: Double): Double = num * 0.035274),
    GtoLB(fun(num: Double): Double = num * 0.00220462),

    //kg
    KGtoKG({num: Double -> num}),
    KGtoMG(fun(num: Double): Double = num * 1e+6),
    KGtoG(fun(num: Double): Double = num * 1000),
    KGtoT(fun(num: Double): Double = num * 0.001),
    KGtoOUNCE(fun(num: Double): Double = num * 35.274),
    KGtoLB(fun(num: Double): Double = num * 2.20462),

    //t
    TtoT({num: Double -> num}),
    TtoMg(fun(num: Double): Double = num * 1e+9),
    TtoG(fun(num: Double): Double = num * 1e+6),
    TtoKG(fun(num: Double): Double = num * 1000),
    TtoOUNCE(fun(num: Double): Double = num * 35274),
    TtoLB(fun(num: Double): Double = num * 2204.62),

    //ounce
    OUNCEtoOUNCE({num: Double -> num}),
    OUNCEtoMG(fun(num: Double): Double = num * 28349),
    OUNCEtoG(fun(num: Double): Double = num * 28.3495),
    OUNCEtoKG(fun(num: Double): Double = num * 0.0283495),
    OUNCEtoT(fun(num: Double): Double = num * 2.835e-5),
    OUNCEtoLB(fun(num: Double): Double = num * 0.0625),

    //lb
    LBtoLB({num: Double -> num}),
    LBtoMG(fun(num: Double): Double = num * 453592),
    LBtoG(fun(num: Double): Double = num * 453592),
    LBtoKG(fun(num: Double): Double = num * 0.453592),
    LBtoT(fun(num: Double): Double = num * 0.000453592),
    LBtoOUNCE(fun(num: Double): Double = num * 16),
}

enum class CurrencyConvertingFun(val function: (Double) -> Double) {
    //ru
    RUtoRU({num: Double -> num}),
    RUtoUSD({ num: Double -> num * 0.0113 }),
    RUtoSB({ num: Double -> num * 1.22 }),
    RUtoEU({ num: Double -> num * 0.0104 }),

    //usd
    USDtoUSD({num: Double -> num}),
    USDtoRU({ num: Double -> num * 89 }),
    USDtoSB({ num: Double -> num * 108 }),
    USDtoEU({ num: Double -> num * 0.917 }),

    //sb
    SBtoSB({num: Double -> num}),
    SBtoRU({ num: Double -> num * 0.82 }),
    SBtoUSD({ num: Double -> num * 0.0093 }),
    SBtoEU({ num: Double -> num * 0.0085 }),

    //eu
    EUtoEU({num: Double -> num}),
    EUtoRU({ num: Double -> num * 97 }),
    EUtoUSD({ num: Double -> num * 1.095 }),
    EUtoSB({ num: Double -> num * 117.2 }),
}

val mapOfLengthFunctions = mapOf(
    "смсм" to LengthConvertingFun.SMtoSM,
    "дмдм" to LengthConvertingFun.DMtoDM,
    "мм" to LengthConvertingFun.MtoM,
    "дюймдюйм" to LengthConvertingFun.INCHtoINCH,
    "ярдярд" to LengthConvertingFun.YARDtoYARD,
    "кмкм" to LengthConvertingFun.KMtoKM,
    "милимили" to LengthConvertingFun.MILEtoMILE,
    "смдм" to LengthConvertingFun.SMtoDM,
    "смм" to LengthConvertingFun.SMtoM,
    "смкм" to LengthConvertingFun.SMtoKM,
    "смдюйм" to LengthConvertingFun.SMtoINCH,
    "смярд" to LengthConvertingFun.SMtoYARD,
    "сммили" to LengthConvertingFun.SMtoMILE,
    "дмсм" to LengthConvertingFun.DMtoSM,
    "дмм" to LengthConvertingFun.DMtoM,
    "дмкм" to LengthConvertingFun.DMtoKM,
    "дмдюйм" to LengthConvertingFun.DMtoINCH,
    "дмярд" to LengthConvertingFun.DMtoYARD,
    "дммиля" to LengthConvertingFun.DMtoMILE,
    "мсм" to LengthConvertingFun.MtoSM,
    "мдм" to LengthConvertingFun.MtoDM,
    "мкм" to LengthConvertingFun.MtoKM,
    "мдюйм" to LengthConvertingFun.MtoINCH,
    "мярд" to LengthConvertingFun.MtoYARD,
    "ммиля" to LengthConvertingFun.MtoMILE,
    "кмсм" to LengthConvertingFun.KMtoSM,
    "кмдм" to LengthConvertingFun.KMtoDM,
    "кмм" to LengthConvertingFun.KMtoM,
    "кмдюйм" to LengthConvertingFun.KMtoINCH,
    "кмярд" to LengthConvertingFun.KMtoYARD,
    "кммиля" to LengthConvertingFun.KMtoMIlE,
    "дюймсм" to LengthConvertingFun.INCHtoSM,
    "дюймдм" to LengthConvertingFun.INCHtoDM,
    "дюймм" to LengthConvertingFun.INCHtoM,
    "дюймкм" to LengthConvertingFun.INCHtoKM,
    "дюймярд" to LengthConvertingFun.INCHtoYARD,
    "дюйммиля" to LengthConvertingFun.INCHtoMile,
    "ярдсм" to LengthConvertingFun.YARDtoSM,
    "ярддм" to LengthConvertingFun.YARDtoDM,
    "ярдм" to LengthConvertingFun.YARDtoM,
    "ярдкм" to LengthConvertingFun.YARDtoKM,
    "ярддюйм" to LengthConvertingFun.YARDtoINCH,
    "ярдмиля" to LengthConvertingFun.YARDtoMILE,
    "милясм" to LengthConvertingFun.MILEtoSM,
    "милядм" to LengthConvertingFun.MILEtoDM,
    "милям" to LengthConvertingFun.MILEtoM,
    "милякм" to LengthConvertingFun.MILEtoKM,
    "милядюйм" to LengthConvertingFun.MILEtoINCH,
    "милярд" to LengthConvertingFun.MILEtoYARD
)

val mapOfWeightFun = mapOf(
    "гг" to WeightConvertingFun.GtoG,
    "мгмг" to WeightConvertingFun.MGtoMG,
    "тоннатонна" to WeightConvertingFun.TtoT,
    "унцияунция" to WeightConvertingFun.OUNCEtoOUNCE,
    "кгкг" to WeightConvertingFun.KGtoKG,
    "фунтфунт" to WeightConvertingFun.LBtoLB,
    "мгг" to WeightConvertingFun.MGtoG,
    "мгкг" to WeightConvertingFun.MGtoKG,
    "мгтонна" to WeightConvertingFun.MGtoT,
    "мгунция" to WeightConvertingFun.MGtoOUNCE,
    "мгфунт" to WeightConvertingFun.MGtoLB,
    "гмг" to WeightConvertingFun.GtoMG,
    "гкг" to WeightConvertingFun.GtoKG,
    "гтонна" to WeightConvertingFun.GtoT,
    "гунция" to WeightConvertingFun.GtoOUNCE,
    "гфунт" to WeightConvertingFun.GtoLB,
    "кгмг" to WeightConvertingFun.KGtoMG,
    "кгг" to WeightConvertingFun.KGtoG,
    "кгтонна" to WeightConvertingFun.KGtoT,
    "кгунция" to WeightConvertingFun.KGtoOUNCE,
    "кгфунт" to WeightConvertingFun.KGtoLB,
    "тоннамг" to WeightConvertingFun.TtoMg,
    "тоннаг" to WeightConvertingFun.TtoG,
    "тоннакг" to WeightConvertingFun.TtoKG,
    "тоннаунция" to WeightConvertingFun.TtoOUNCE,
    "тоннафунт" to WeightConvertingFun.TtoLB,
    "унциямг" to WeightConvertingFun.OUNCEtoMG,
    "унцияг" to WeightConvertingFun.OUNCEtoG,
    "унциякг" to WeightConvertingFun.OUNCEtoKG,
    "унциятонна" to WeightConvertingFun.OUNCEtoT,
    "унцияфунт" to WeightConvertingFun.OUNCEtoLB,
    "фунтмг" to WeightConvertingFun.LBtoMG,
    "фунтг" to WeightConvertingFun.LBtoG,
    "фунткг" to WeightConvertingFun.LBtoKG,
    "фунттонна" to WeightConvertingFun.LBtoT,
    "фунтунция" to WeightConvertingFun.LBtoOUNCE
)

val mapOfCurrencyFun = mapOf(
    "Российский рубльРоссийский рубль" to CurrencyConvertingFun.RUtoRU,
    "Доллар СШАДоллар США" to CurrencyConvertingFun.USDtoUSD,
    "Сербский динарСербский динар" to CurrencyConvertingFun.SBtoSB,
    "ЕвроЕвро" to CurrencyConvertingFun.EUtoEU,
    "Российский рубльДоллар США" to CurrencyConvertingFun.RUtoUSD,
    "Российский рубльСербский динар" to CurrencyConvertingFun.RUtoSB,
    "Российский рубльЕвро" to CurrencyConvertingFun.RUtoEU,
    "Доллар СШАРоссийский рубль" to CurrencyConvertingFun.USDtoRU,
    "Доллар СШАСербский динар" to CurrencyConvertingFun.USDtoSB,
    "Доллар СШАЕвро" to CurrencyConvertingFun.USDtoEU,
    "Сербский динарРоссийский рубль" to CurrencyConvertingFun.SBtoRU,
    "Сербский динарДоллар США" to CurrencyConvertingFun.SBtoUSD,
    "Сербский динарЕвро" to CurrencyConvertingFun.SBtoEU,
    "ЕвроРоссийский рубль" to CurrencyConvertingFun.EUtoRU,
    "ЕвроДоллар США" to CurrencyConvertingFun.EUtoUSD,
    "ЕвроСербский динар" to CurrencyConvertingFun.EUtoSB
)


