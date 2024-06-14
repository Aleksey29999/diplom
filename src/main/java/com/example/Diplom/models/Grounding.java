package com.example.Diplom.models;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data

public class Grounding {
    private double climaticRegion1; //Климатический коэффициент для вертикального заземлителя
    private double climaticRegion2; //Климатический коэффициент для горизонтального заземлителя
    private double resistanceUpGround; // Удельное сопротивление верхнего слоя грунта, Ом*м:    r1
    private double widthUpGrounding; //Толщина верхнего слоя грунта, м:                       H
    private double resistanceDownGround; //Удельное сопротивление нижнего слоя грунта, Ом*м:  r2
    private int countVerticalGrounding; //Количество вертикальных заземлителей, шт:  Nверт
    private double lengthVerticalGrounding; //Длина вертикальных заземлителей, м:      L
    private double diametrVerticalGrounding; // Диаметр вертикальных заземлителей, м:  Dверт
    private double countHorizontalGrounding; // Длина горизонтального заземлителя, м:  Lгор
    private double depthHorizontalGrounding; //Глубина прокладки горизонтального заземлителя,м: tполосы
    private double widthHorizontalGrounding ; //Ширина горизонтального заземлителя, м:  b
    private double utilizationFactor1; //коэффициент использования (экранирования ) вертикального заземлителя Kиг
    private double utilizationFactor2; //коэффициент использования (экранирования ) горизонтального заземлителя Kиг
    private double totalElectricalResistanceGround; //Удельное сопротивление грунта, Ом*м: Rуд
    private double resistanceSingleVerticalGrounding; //Сопротивление одного вертикального электрода, Ом: Rв1
    private double resistanceTotalVerticalGrounding; //Суммарное сопротивление вертикального заземлителя, Ом: Rв
    private double resistanceHorizontalGrounding; //Сопротивление горизонтального заземлителя, Ом: Rг1
    private double resistanceTotalHorizontalGrounding; //Суммарное сопротивление горизонтального заземлителя, Ом: Rг
    private double totalResistanceGrounding; //Сопротивление контура заземления, Ом: Rобщ


}
