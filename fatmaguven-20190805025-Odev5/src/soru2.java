
public sealed class soru2 {

	public static void main(String[] args) {
		/*
		 * ● HashSet:
HashSet’te veriler hashleme yöntemi ile tutulur. Verilerin sırasının korunacağını garanti etmez. Yani önce e1, sonra e2 elementini kaydedip e2, e1 sırasında çekebilirsiniz. Aynı zamanda HashSet<E> non-synchronized olduğu için birden fazla thread aynı anda bir HashSet’e erişip değiştirmeye çalışırsa problem yaşamamak için manuel bir çözüm olarak synchronized erişim sağlamalıyız.
		 * 
		 * ● ArrayList<E>
Collection framework’te en çok kullanılan class’tır. Arraylist'in karakteristik özellikleri tekrarlı elementlere izin vermesi, elementleri ekleme sırasına göre tutması ve istediğimiz index’e element eklememize izin vermesidir. 
		 *
		*● LinkedList<E>
		*Sonuçları bakımından ArrayList ile aynıdır. Fakat aralarında bazı farklar mevcuttur. Arama işlemlerinde LinkedList O(n) iken ArrayList’te O(1)’dir. Silme işlemlerinde ise ArrayList O(n) iken LinkedList O(1)’dir. Ekleme işlemleri de aynı sonuçları verir. Dolayısıyla eğer ekleme ve silme işlemleri sık yapılacaksa LinkedList kullanmak daha avantajlıdır. Arama işlemleri sık yapılacak ise de ArrayList daha avantajlıdır.
*
*       HashMap<K, V>
HashMap’ler sıralamayı garanti etmez. null key ve null value kabul eder.
*
*ArrayList ve LinkedList arasındaki farklar:
*ArrayList ve LinkedList birebir aynıdır. Aralarındaki tek fark algoritma yapılarıdır diyebiliriz.
*LinkedList’te eleman silme veya araya eleman ekleme durumlarında kaydırma işlemi yapılmaz.
*LinkedList sınıfı, ArrayList gibi thread-safe değildir. Bu List türünde de veri bütünlüğünü sorunu vardır.
*LinkedList, hem List interface'inden hem Queue (Kuyruk) interface'inden miras alan bir sınıftır.
*Kullanılacak veri grubunu bir listeye koymamız ve bu gruba veri ekleme işlemi sürekli yapılacaksa, LinkedList kullanılması önerilir.
*
*/
	}

}
