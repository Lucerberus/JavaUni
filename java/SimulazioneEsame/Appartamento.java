package SimulazioneEsame;

import java.util.ArrayList;

public class Appartamento implements Illuminazione 
{
	private String descrizione;
	private ArrayList<Boolean> stato;
	
	public Appartamento(String descrizione, int Nstanze)
	{
		setDescrizione(descrizione);
		InitList(Nstanze);
	}
	public void setDescrizione(String d)
	{
		this.descrizione=d;
	}
	public String getDescrizione()
	{
		return this.descrizione;
	}
	private void InitList(int Nstanze)
	{
		stato=new ArrayList<Boolean>();
		for(int i=0; i<Nstanze; i++)
			stato.add(false);
	}
	public String getStatoLuci()
	{	
		int i=0;
		String s="{";
		for(boolean stanza:stato)
		{	
			if(stanza)
				s=s+"stanza "+i+": Accesa\n";
			else
				s=s+"stanza "+i+": Spenta\n";
			
			i++;
		}
		return s;
	}
	
	public void accendi(int id)
	{
		if(stato.get(id))
			System.out.println("Luce stanza "+id+" già accesa");
		else
		{	
			stato.set(id, true);
			System.out.println("Luce stanza "+id+" accesa");
		}
	}
	
	public void spegni(int id)
	{
		if(stato.get(id))
		{
			stato.set(id, false);
			System.out.println("Luce stanza "+id+" spenta");
		}
		else
			System.out.println("Luce stanza "+id+" già spenta");
		
	}
	public void accendiTutto()
	{	
		int s=stato.size();
		stato.removeAll(stato);
		for(int i=0; i<s; i++)
			stato.add(true);
		System.out.println("Tutte luci accese");
	}
	
	public void spegniTutto()
	{
		int s=stato.size();
		stato.removeAll(stato);
		for(int i=0; i<s; i++)
			stato.add(true);
		System.out.println("Tutte luci spente");
	}
	
	public String toString()
	{
		return "descrizione: "+this.descrizione+"\nstato delle luci: "+getStatoLuci();
	}
		
		
	
	
	
}