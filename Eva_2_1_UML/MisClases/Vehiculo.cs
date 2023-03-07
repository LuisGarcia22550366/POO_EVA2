using Microsoft.VisualBasic;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MisClases
{
    internal class Vehiculo
    {

        private int year;
        private int marca;
        private String model;

        public int Year { get { return year; } set { year = value; } }

        public int Marca { get { return marca; } set { marca = value; } }


        public String Model { get { return model; } set { model = value; } }
    }
}
