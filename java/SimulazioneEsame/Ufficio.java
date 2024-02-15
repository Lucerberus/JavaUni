package SimulazioneEsame;

import java.util.ArrayList;

public class Ufficio extends Appartamento
{
	private ArrayList<Boolean> stato_em;
	
	public Ufficio(String descrizione, int Nstanze)
	{
		super(descrizione, Nstanze);
		InitLuciEm(Nstanze);
	}
	
	private void InitLuciEm(int n)
	{
		stato_em=new ArrayList<Boolean>();
		for(int i=0; i<n; i++)
			stato_em.add(false);
	}
	public void accendiEM(int id)
	{
		if(stato_em.get(id))
			System.out.println("Luce Emergenza stanza "+id+" già accesa");
		else
		{	
			stato_em.set(id, true);
			System.out.println("Luce Emergenza stanza "+id+" accesa");
		}
	}
	
	public void spegniEM(int id)
	{
		if(stato_em.get(id))
		{
			stato_em.set(id, false);
			System.out.println("Luce Emergenza stanza "+id+" spenta");
		}
		else
			System.out.println("Luce Emergenza stanza "+id+" già spenta");
		
	}
	
	public void accendiTutto()
	{	
		int s=stato_em.size();
		stato_em.removeAll(stato_em);
		for(int i=0; i<s; i++)
			stato_em.add(true);
		super.accendiTutto();
	}
	
	public void spegniTutto()
	{
		int s=stato_em.size();
		stato_em.removeAll(stato_em);
		for(int i=0; i<s; i++)
			stato_em.add(true);
		super.spegniTutto();
	}

	public String getStatoLuciEM()
	{
		int i=0;
		String s="{ ";
		for(boolean stanza:stato_em)
		{	
			if(stanza)
				s=s+"stanza "+i+": Em Accesa\n";
			else
				s=s+"stanza "+i+": Em Spenta\n";
			
			i++;
		}
		return s+" }";
	}


	public String toString() {
		
		return super.toString()+"\nstato luci em: "+getStatoLuciEM();
	}
	
}