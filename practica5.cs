using System;



public enum Action
{
    DELETE,REPORT
}

public abstract class Antivirus
{
    public bool scan(byte[] memory, Action action)
    {
        bool virusFound = false;
        int index = 0;

        while(index < memory.Length)
        {
            int size = findVirus(memory,index);

            if(size > 0)
            {   
                switch(action)
                {
                    case Action.DELETE: deleteVirus(memory,index,size);break;
                    case Action.REPORT: repotVirus(memory,index,size);break;

                }
                index += size;
                virusFound = true;
            }
            index++;
        }
        return virusFound;
    }

    public abstract int findVirus(byte[] memory, int startIndex );
    public abstract void repotVirus(byte[] memory, int startIndex, int size);
    public abstract void deleteVirus(byte[] memory, int startIndex, int size);


}


public class LinearVirusScanner : Antivirus 
{




    public override int findVirus(byte[] memory, int startIndex)
    {
        
    }

    public override void repotVirus(byte[] memory, int startIndex, int size)
    {
    
    }

    public override void deleteVirus(byte[] memory, int startIndex, int size)
    {
        
    }
}






