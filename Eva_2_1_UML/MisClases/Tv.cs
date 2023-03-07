using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MisClases
{
    internal class Tv
    {

        private int channel;
        private int volume;
        private String on_off;

        public int Channel { get { return channel; } set { channel = value; } }

        public int Volume { get { return volume; } set { volume = value; } }

        public String OnOff { get { return on_off;} set { on_off = value; } }
    }
}
