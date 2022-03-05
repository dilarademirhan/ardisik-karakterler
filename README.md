# Ardışık Karakterler

Bu projede, Java dilini kullanarak, yazı içeren herhangi bir dosya (“veri.txt”) için ardışık karakter bilgilerinin bağlantılı liste yapısında tutulmasını sağlayan bir algoritma geliştirilmesi beklenmektedir. Projede, birden fazla tekli bağlantılı liste (multi singly linked list) veri yapısını kullanılmalıdır.

## İstenilenler

- “veri.txt” dosyasında birden fazla cümle bulunmaktadır. Bu dosyayı karakter karakter okuyarak tekli bağlantılı listeye ekleme işlemlerini gerçekleştirmelisiniz. Dosyadan veriler okundukça multi singly linked list yapısını oluşturmanız gerekmektedir. Listeye ekleme işlemleri okuma sırasında yapılmalıdır. Önce bütün dosyayı okuma işlemini yapıp bu bilgileri ayrı bir yerde saklama yoluna gidilmemelidir.
- Sizin programınız her kelimeyi karakter karakter okuyarak, sırasıyla her karakteri ayrı bir
düğüm olacak şekilde gerekli kontrolleri yaparak kendinizin yazdığı tekli bağlantılı listeye
eklemelidir. Buradaki amaç, peş peşe gelen 2 adet karakterin bilgisini tutmaktır. Her karakterin
bulunduğu düğümün altında ayrıca sonrasında gelen karakterin bilgisi ve kaç kere peşi sıra
geldiği bilgisi tutulmalıdır.
- Bağlantılı listenizde iki farklı düğüm (Node) tanımı olmalıdır.
- Biri ana listedeki karakterler için, ana düğümler (örneğin; e, v, d gibi)
- Diğeri ise bu ana düğümlere bağlanacaklar için, liste düğümleri (örneğin; l-3, a-2 gibi)
- Aşağıda verilen örnek yapıdan da anlaşılacağı üzere, sizden iki katmanlı bağlantılı liste yapısı
istenmektedir. Bu yapı kurulurken uyulması gereken kurallar şu şekildedir;
- Her bir ana düğüm hem kendi listesindeki ilk düğümü (sonrasında gelen karakter), hem
de bir sonraki ana düğümü (başka bir karakter) işaret edebilmelidir
- Ana düğüm eklenirken liste kontrol edilmelidir, tekrar olmamalıdır
- Ana düğümlerin içerdiği karakterin kaç kere geçtiği bilgisi tutulmamaktadır
- Liste düğümü eklenirken, ekleneceği ana düğümün listesi kontrol edilmelidir
    - Eğer varsa sayısı 1 arttırılmalıdır
    - Yoksa sayısı 1 olacak şekilde listenin sonuna eklenmelidir
- Ayrıca şu metotları içermelidir:
    - ardisikKarakterler(char k) → k karakterinin peşi sıra gelen karakterleri yazar
    - enCokArdisik() → en çok peş peşe gelen karakter ikilisini yazar
    - enCokArdisik(char k) → k karakterinin peşi sıra en çok gelen karakteri yazar
    - enAzArdisik() → en az peş peşe gelen karakter ikilisini yazar
    - enAzArdisik(char k) → k karakterinin peşi sıra en az gelen karakteri yazar  

**Örnek:**  
Okunacak dosya içeriği (veri.txt)  
Ali evde kal, evinde kal.  
Bu dosya için oluşması gereken yapı ise aşağıdaki gibi olmalıdır  

![1](Resim.PNG)
