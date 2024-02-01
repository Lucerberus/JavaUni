# Consegna primo appello gennaio 2024

## Interfacce

Data l'interfaccia astratta **pulizia**, prevedere:

- il _metodo spegniAccendi()_: che inverte lo stato corrente dell'elettrodomestico
- il _metodo pulisci()_: se l'elettrodomestico è acceso allora lancia un eccezione (anche personalizzata), altrimenti procede con la pulizia.

## Classi

Implementare le classi:

- **Elettrodomestico**:

  - Integer _id_
  - String _modello_
  - Boolean _stato_
  - Implementare _spegniAccendi_()

- **Macchina Caffè** che estende **elettrodomestico**:

  - Integer _livelloAcqua_
  - _pulisci_() deve scansionare da tastiera un metodo di pulizia tra Decalcificazione e Standard (possibilità Enum)

- **Forno** che estende **elettrodomestico**:

  - String _temperatura_
  - _pulisci_() deve scansionare da tastiera il livello di pulizia (int) e stamparlo a schermo

## Menu

Creare una classe Menu dove, utilizzando un array list, sarà possibile:

- Inserire un nuovo forno
- Inserire una nuova macchina del caffé
- Pulire un elettrodomestico per ID
- Accendere o spegnere un elettrodomestico per ID
- Cancellare per id un elettrodomestico
- Ordinare per ID
- Ordinare per Modello
- Stampare la lista dove verranno memorizzati gli elettrodomestici
- Uscire dal programma
