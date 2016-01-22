package de.hrw.wi.business;

import java.util.Set;

/**
 * @author andriesc
 *
 *         Warehouse ist ein Lager. Bei der Erzeugung wird seine Gr��e
 *         angegeben: Ein Warehouse kann n F�cher der jeweils gleichen Gr��e k
 *         enthalten.
 * 
 *         In einem Fach k�nnen jeweils nur Gegenst�nde eines Typs abgegelegt
 *         werden, von diesem Gegenstand aber dann soviele, solange die Summe der
 *         Gr��e der Gegenst�nde nicht gr��er ist als die Gr��e des Faches.
 * 
 *         In ein Lager k�nnen Gegenst�nde eingelagert und ausgelagert werden.
 * 
 *         Auf ein Warehouse soll niemals direkt zugegriffen werden, sondern nur
 *         �ber einen entsprechenden Service.
 * 
 */
public class Warehouse {
	/**
	 * 
	 */
	public Warehouse(int numberOfBins, int sizeOfBins) {
	}

	/**
	 * Die Methode ermittelt, welches Fach der n�chste freie Lagerplatz ist,
	 * wenn ich etwas der Gr��e size ablegen will.
	 * 
	 * @param size
	 *            Gr��e des oder der Gegenst�nde, die ich ablegen will
	 * 
	 * @return Nummer des n�chsten freien Lagerplatzes passender Gr��e. Die
	 *         Lagerpl�tze werden bei 0 anfangend durchnummeriert. Ist kein
	 *         Platz mehr frei, wird -1 zur�ckgegeben.
	 */
	public int nextFreeBin(int size) {
		// TODO implement this method
		return 0;
	}

	/**
	 * Lagert von einem Produkt die angegebene Anzahl in einem angegebenen
	 * Lagerplatz ein. Wenn das Einlagern fehlschl�gt, weil der Lagerplatz zu
	 * klein ist f�r das Produkt und seine Anzahl, dann wird das Produkt gar
	 * nicht eingelagert. Gegebenenfalls muss man also die Anzahl des Produktes
	 * anschlie�end in zwei oder mehrere neue Einlagerversuche aufteilen.
	 * 
	 * @param p
	 *            Das einzulagernde Produkt
	 * @param quantity
	 *            Angabe, in welcher St�ckanzahl das Produkt eingelagert werden
	 *            soll
	 * @param bin
	 *            der Ziel-Lagerplatz f�r die Einlagerung
	 * @return gibt true zur�ck, wenn das Einlagern erfolgreich war oder false,
	 *         wenn es nicht erfolgreich war (etwa Lagerplatz nicht gro� genug)
	 */
	public boolean placeIntoStock(Product p, int quantity, StorageBin bin) {
		// TODO implement this method
		return false;
	}

	/**
	 * Entnimmt von einem Produkt die angegebene Anzahl aus dem angegebenen
	 * Lagerplatz. Wenn das Auslagern fehlschl�gt weil etwa nicht gen�gend St�ck
	 * des Produktes vorhanden sind, wird gar nichts aus dem Lager entnommen.
	 * Gegebenenfalls muss also in einem weiteren Auslagerversuch versucht
	 * werden, eine reduzierte Anzahl von Produkten zu entnehmen.
	 * 
	 * @param p
	 *            Das auszulagernde Produkt
	 * @param quantity
	 *            Angabe, in welcher St�ckzahl das Produkt entnommen werden soll
	 * @param bin
	 *            Der Lagerplatz, aus dem das Produkt in angegebener St�ckzahl
	 *            entnommen werden soll
	 * @return gibt true zur�ck, wenn das Auslagern erfolgreich war oder false,
	 *         wenn es nicht erfolgreich war (Produkt nicht in ausreichender
	 *         Anzahl vorhanden)
	 */
	public boolean removeFromStock(Product p, int quantity, StorageBin bin) {
		// TODO implement this method
		return false;
	}

	/**
	 * 
	 * Gibt aus, wie gro� der Bestand in diesem Lager von dem jeweiligen Produkt
	 * ist.
	 * 
	 * @param p
	 *            das angefragte Produkt
	 * @return Die Anzahl
	 */
	public int availableStock(Product p) {
		// TODO implement this method
		return 0;
	}

	/**
	 * Gibt aus, wo im Lager das Produkt gespeichert ist.
	 * 
	 * @param p
	 * @return Eine Menge von Lagerpl�tzen oder eine leere Menge, wenn das
	 *         Produkt gar nicht vorhanden ist.
	 */
	public Set<StorageBin> retrieveBinsOf(Product p) {
		// TODO implement this method
		return null;
	}

}
