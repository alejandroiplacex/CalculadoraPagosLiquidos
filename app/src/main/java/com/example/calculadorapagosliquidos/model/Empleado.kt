package com.example.calculadorapagosliquidos.model

open class Empleado(val sueldoBruto: Double) {
    open fun calcularLiquido(): Double = sueldoBruto

    open fun desglosePago(): Map<String, Double> {
        return mapOf(
            "Sueldo Bruto" to sueldoBruto,
            "Líquido a Pagar" to calcularLiquido()
        )
    }
}

class EmpleadoHonorario(sueldoBruto: Double) : Empleado(sueldoBruto) {
    override fun calcularLiquido(): Double = sueldoBruto * 0.87  // 13% retención

    override fun desglosePago(): Map<String, Double> {
        val retencion = sueldoBruto * 0.13
        return mapOf(
            "Sueldo Bruto" to sueldoBruto,
            "Retención (13%)" to retencion,
            "Líquido a Pagar" to calcularLiquido()
        )
    }
}

class EmpleadoRegular(sueldoBruto: Double) : Empleado(sueldoBruto) {
    override fun calcularLiquido(): Double = sueldoBruto * 0.80  // 20% retención

    override fun desglosePago(): Map<String, Double> {
        val retencion = sueldoBruto * 0.20
        return mapOf(
            "Sueldo Bruto" to sueldoBruto,
            "Retención (20%)" to retencion,
            "Líquido a Pagar" to calcularLiquido()
        )
    }
}