using System.Runtime.Versioning;
using System.Threading.Tasks.Sources;

namespace MisClases
{
    public class Persona
    {

        private int id;
        private string name;
        private int age;

        public int Id { get { return id; } set { id = value; } }


        public string Name { get { return name; } set { name = value; } }

        public int Age { get { return age;} set { age = value; } }
    }

}
