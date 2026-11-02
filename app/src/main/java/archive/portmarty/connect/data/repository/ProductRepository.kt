package archive.portmarty.connect.data.repository

import archive.portmarty.connect.data.model.Product
import archive.portmarty.connect.data.model.ProductCategory
import archive.portmarty.connect.data.model.ProductText
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class ProductRepository {
    private val products = listOf(
        Product(
            id = 1,
            texts = mapOf(
                "en" to ProductText("Armchair", "The Armchair combines durable materials with a clean, practical design. Its balanced proportions make it easy to use and place in a room. Simple care helps it stay attractive for years."),
                "de" to ProductText("Sessel", "Der Artikel Sessel verbindet langlebige Materialien mit einem klaren, praktischen Design. Seine ausgewogenen Proportionen erleichtern die Nutzung und Platzierung im Raum. Mit einfacher Pflege bleibt er über Jahre ansprechend."),
                "es" to ProductText("Sillón", "El producto Sillón combina materiales duraderos con un diseño limpio y práctico. Sus proporciones equilibradas permiten usarlo y colocarlo fácilmente en una habitación. Un cuidado sencillo ayuda a mantener su buen aspecto durante años."),
                "fr" to ProductText("Fauteuil", "Le produit Fauteuil associe des matériaux durables à un design épuré et pratique. Ses proportions équilibrées facilitent son utilisation et son installation dans une pièce. Un entretien simple lui permet de rester élégant pendant des années."),
                "hi" to ProductText("आरामकुर्सी", "यह आरामकुर्सी टिकाऊ सामग्री और साफ़, उपयोगी डिज़ाइन का मेल है। इसका संतुलित आकार इसे कमरे में रखना और इस्तेमाल करना आसान बनाता है। साधारण देखभाल से यह वर्षों तक सुंदर बना रहता है।"),
                "id" to ProductText("Kursi berlengan", "Produk Kursi berlengan memadukan bahan tahan lama dengan desain bersih dan praktis. Proporsinya yang seimbang membuatnya mudah digunakan dan ditempatkan di ruangan. Perawatan sederhana membantu menjaga tampilannya selama bertahun-tahun."),
                "pt" to ProductText("Poltrona", "O produto Poltrona combina materiais duráveis com um design limpo e prático. Suas proporções equilibradas facilitam o uso e a colocação no ambiente. Cuidados simples ajudam a manter sua boa aparência por muitos anos."),
                "ar" to ProductText("كرسي بذراعين", "يجمع منتج كرسي بذراعين بين المواد المتينة والتصميم الأنيق والعملي. وتسهّل أبعاده المتوازنة استخدامه ووضعه في الغرفة. وتساعد العناية البسيطة في الحفاظ على مظهره لسنوات."),
            ),
            category = ProductCategory.SEATING,
            price = 249.00,
            imageUrl = "https://images.unsplash.com/photo-1763279934323-edb3735f6a6e?w=800&q=80",
        ),
        Product(
            id = 2,
            texts = mapOf(
                "en" to ProductText("Dining chair", "The Dining chair combines durable materials with a clean, practical design. Its balanced proportions make it easy to use and place in a room. Simple care helps it stay attractive for years."),
                "de" to ProductText("Esszimmerstuhl", "Der Artikel Esszimmerstuhl verbindet langlebige Materialien mit einem klaren, praktischen Design. Seine ausgewogenen Proportionen erleichtern die Nutzung und Platzierung im Raum. Mit einfacher Pflege bleibt er über Jahre ansprechend."),
                "es" to ProductText("Silla de comedor", "El producto Silla de comedor combina materiales duraderos con un diseño limpio y práctico. Sus proporciones equilibradas permiten usarlo y colocarlo fácilmente en una habitación. Un cuidado sencillo ayuda a mantener su buen aspecto durante años."),
                "fr" to ProductText("Chaise de salle à manger", "Le produit Chaise de salle à manger associe des matériaux durables à un design épuré et pratique. Ses proportions équilibrées facilitent son utilisation et son installation dans une pièce. Un entretien simple lui permet de rester élégant pendant des années."),
                "hi" to ProductText("डाइनिंग कुर्सी", "यह डाइनिंग कुर्सी टिकाऊ सामग्री और साफ़, उपयोगी डिज़ाइन का मेल है। इसका संतुलित आकार इसे कमरे में रखना और इस्तेमाल करना आसान बनाता है। साधारण देखभाल से यह वर्षों तक सुंदर बना रहता है।"),
                "id" to ProductText("Kursi makan", "Produk Kursi makan memadukan bahan tahan lama dengan desain bersih dan praktis. Proporsinya yang seimbang membuatnya mudah digunakan dan ditempatkan di ruangan. Perawatan sederhana membantu menjaga tampilannya selama bertahun-tahun."),
                "pt" to ProductText("Cadeira de jantar", "O produto Cadeira de jantar combina materiais duráveis com um design limpo e prático. Suas proporções equilibradas facilitam o uso e a colocação no ambiente. Cuidados simples ajudam a manter sua boa aparência por muitos anos."),
                "ar" to ProductText("كرسي طعام", "يجمع منتج كرسي طعام بين المواد المتينة والتصميم الأنيق والعملي. وتسهّل أبعاده المتوازنة استخدامه ووضعه في الغرفة. وتساعد العناية البسيطة في الحفاظ على مظهره لسنوات."),
            ),
            category = ProductCategory.SEATING,
            price = 129.00,
            imageUrl = "https://images.unsplash.com/photo-1730373451883-45a448eb9bfc?w=800&q=80",
        ),
        Product(
            id = 3,
            texts = mapOf(
                "en" to ProductText("Coffee table", "The Coffee table combines durable materials with a clean, practical design. Its balanced proportions make it easy to use and place in a room. Simple care helps it stay attractive for years."),
                "de" to ProductText("Couchtisch", "Der Artikel Couchtisch verbindet langlebige Materialien mit einem klaren, praktischen Design. Seine ausgewogenen Proportionen erleichtern die Nutzung und Platzierung im Raum. Mit einfacher Pflege bleibt er über Jahre ansprechend."),
                "es" to ProductText("Mesa de centro", "El producto Mesa de centro combina materiales duraderos con un diseño limpio y práctico. Sus proporciones equilibradas permiten usarlo y colocarlo fácilmente en una habitación. Un cuidado sencillo ayuda a mantener su buen aspecto durante años."),
                "fr" to ProductText("Table basse", "Le produit Table basse associe des matériaux durables à un design épuré et pratique. Ses proportions équilibrées facilitent son utilisation et son installation dans une pièce. Un entretien simple lui permet de rester élégant pendant des années."),
                "hi" to ProductText("कॉफी टेबल", "यह कॉफी टेबल टिकाऊ सामग्री और साफ़, उपयोगी डिज़ाइन का मेल है। इसका संतुलित आकार इसे कमरे में रखना और इस्तेमाल करना आसान बनाता है। साधारण देखभाल से यह वर्षों तक सुंदर बना रहता है।"),
                "id" to ProductText("Meja kopi", "Produk Meja kopi memadukan bahan tahan lama dengan desain bersih dan praktis. Proporsinya yang seimbang membuatnya mudah digunakan dan ditempatkan di ruangan. Perawatan sederhana membantu menjaga tampilannya selama bertahun-tahun."),
                "pt" to ProductText("Mesa de centro", "O produto Mesa de centro combina materiais duráveis com um design limpo e prático. Suas proporções equilibradas facilitam o uso e a colocação no ambiente. Cuidados simples ajudam a manter sua boa aparência por muitos anos."),
                "ar" to ProductText("طاولة قهوة", "يجمع منتج طاولة قهوة بين المواد المتينة والتصميم الأنيق والعملي. وتسهّل أبعاده المتوازنة استخدامه ووضعه في الغرفة. وتساعد العناية البسيطة في الحفاظ على مظهره لسنوات."),
            ),
            category = ProductCategory.TABLES,
            price = 189.00,
            imageUrl = "https://images.unsplash.com/photo-1758565811033-84d1365000c6?w=800&q=80",
        ),
        Product(
            id = 4,
            texts = mapOf(
                "en" to ProductText("Dining table", "The Dining table combines durable materials with a clean, practical design. Its balanced proportions make it easy to use and place in a room. Simple care helps it stay attractive for years."),
                "de" to ProductText("Esstisch", "Der Artikel Esstisch verbindet langlebige Materialien mit einem klaren, praktischen Design. Seine ausgewogenen Proportionen erleichtern die Nutzung und Platzierung im Raum. Mit einfacher Pflege bleibt er über Jahre ansprechend."),
                "es" to ProductText("Mesa de comedor", "El producto Mesa de comedor combina materiales duraderos con un diseño limpio y práctico. Sus proporciones equilibradas permiten usarlo y colocarlo fácilmente en una habitación. Un cuidado sencillo ayuda a mantener su buen aspecto durante años."),
                "fr" to ProductText("Table à manger", "Le produit Table à manger associe des matériaux durables à un design épuré et pratique. Ses proportions équilibrées facilitent son utilisation et son installation dans une pièce. Un entretien simple lui permet de rester élégant pendant des années."),
                "hi" to ProductText("डाइनिंग टेबल", "यह डाइनिंग टेबल टिकाऊ सामग्री और साफ़, उपयोगी डिज़ाइन का मेल है। इसका संतुलित आकार इसे कमरे में रखना और इस्तेमाल करना आसान बनाता है। साधारण देखभाल से यह वर्षों तक सुंदर बना रहता है।"),
                "id" to ProductText("Meja makan", "Produk Meja makan memadukan bahan tahan lama dengan desain bersih dan praktis. Proporsinya yang seimbang membuatnya mudah digunakan dan ditempatkan di ruangan. Perawatan sederhana membantu menjaga tampilannya selama bertahun-tahun."),
                "pt" to ProductText("Mesa de jantar", "O produto Mesa de jantar combina materiais duráveis com um design limpo e prático. Suas proporções equilibradas facilitam o uso e a colocação no ambiente. Cuidados simples ajudam a manter sua boa aparência por muitos anos."),
                "ar" to ProductText("طاولة طعام", "يجمع منتج طاولة طعام بين المواد المتينة والتصميم الأنيق والعملي. وتسهّل أبعاده المتوازنة استخدامه ووضعه في الغرفة. وتساعد العناية البسيطة في الحفاظ على مظهره لسنوات."),
            ),
            category = ProductCategory.TABLES,
            price = 599.00,
            imageUrl = "https://images.unsplash.com/photo-1758977404039-6e834be8eca8?w=800&q=80",
        ),
        Product(
            id = 5,
            texts = mapOf(
                "en" to ProductText("Bookcase", "The Bookcase combines durable materials with a clean, practical design. Its balanced proportions make it easy to use and place in a room. Simple care helps it stay attractive for years."),
                "de" to ProductText("Bücherregal", "Der Artikel Bücherregal verbindet langlebige Materialien mit einem klaren, praktischen Design. Seine ausgewogenen Proportionen erleichtern die Nutzung und Platzierung im Raum. Mit einfacher Pflege bleibt er über Jahre ansprechend."),
                "es" to ProductText("Librería", "El producto Librería combina materiales duraderos con un diseño limpio y práctico. Sus proporciones equilibradas permiten usarlo y colocarlo fácilmente en una habitación. Un cuidado sencillo ayuda a mantener su buen aspecto durante años."),
                "fr" to ProductText("Bibliothèque", "Le produit Bibliothèque associe des matériaux durables à un design épuré et pratique. Ses proportions équilibrées facilitent son utilisation et son installation dans une pièce. Un entretien simple lui permet de rester élégant pendant des années."),
                "hi" to ProductText("बुककेस", "यह बुककेस टिकाऊ सामग्री और साफ़, उपयोगी डिज़ाइन का मेल है। इसका संतुलित आकार इसे कमरे में रखना और इस्तेमाल करना आसान बनाता है। साधारण देखभाल से यह वर्षों तक सुंदर बना रहता है।"),
                "id" to ProductText("Rak buku", "Produk Rak buku memadukan bahan tahan lama dengan desain bersih dan praktis. Proporsinya yang seimbang membuatnya mudah digunakan dan ditempatkan di ruangan. Perawatan sederhana membantu menjaga tampilannya selama bertahun-tahun."),
                "pt" to ProductText("Estante de livros", "O produto Estante de livros combina materiais duráveis com um design limpo e prático. Suas proporções equilibradas facilitam o uso e a colocação no ambiente. Cuidados simples ajudam a manter sua boa aparência por muitos anos."),
                "ar" to ProductText("خزانة كتب", "يجمع منتج خزانة كتب بين المواد المتينة والتصميم الأنيق والعملي. وتسهّل أبعاده المتوازنة استخدامه ووضعه في الغرفة. وتساعد العناية البسيطة في الحفاظ على مظهره لسنوات."),
            ),
            category = ProductCategory.STORAGE,
            price = 279.00,
            imageUrl = "https://images.unsplash.com/photo-1603058817990-2b9a9abbce86?w=800&q=80",
        ),
        Product(
            id = 6,
            texts = mapOf(
                "en" to ProductText("Sideboard", "The Sideboard combines durable materials with a clean, practical design. Its balanced proportions make it easy to use and place in a room. Simple care helps it stay attractive for years."),
                "de" to ProductText("Sideboard", "Der Artikel Sideboard verbindet langlebige Materialien mit einem klaren, praktischen Design. Seine ausgewogenen Proportionen erleichtern die Nutzung und Platzierung im Raum. Mit einfacher Pflege bleibt er über Jahre ansprechend."),
                "es" to ProductText("Aparador", "El producto Aparador combina materiales duraderos con un diseño limpio y práctico. Sus proporciones equilibradas permiten usarlo y colocarlo fácilmente en una habitación. Un cuidado sencillo ayuda a mantener su buen aspecto durante años."),
                "fr" to ProductText("Buffet", "Le produit Buffet associe des matériaux durables à un design épuré et pratique. Ses proportions équilibrées facilitent son utilisation et son installation dans une pièce. Un entretien simple lui permet de rester élégant pendant des années."),
                "hi" to ProductText("साइडबोर्ड", "यह साइडबोर्ड टिकाऊ सामग्री और साफ़, उपयोगी डिज़ाइन का मेल है। इसका संतुलित आकार इसे कमरे में रखना और इस्तेमाल करना आसान बनाता है। साधारण देखभाल से यह वर्षों तक सुंदर बना रहता है।"),
                "id" to ProductText("Bufet", "Produk Bufet memadukan bahan tahan lama dengan desain bersih dan praktis. Proporsinya yang seimbang membuatnya mudah digunakan dan ditempatkan di ruangan. Perawatan sederhana membantu menjaga tampilannya selama bertahun-tahun."),
                "pt" to ProductText("Aparador", "O produto Aparador combina materiais duráveis com um design limpo e prático. Suas proporções equilibradas facilitam o uso e a colocação no ambiente. Cuidados simples ajudam a manter sua boa aparência por muitos anos."),
                "ar" to ProductText("خزانة جانبية", "يجمع منتج خزانة جانبية بين المواد المتينة والتصميم الأنيق والعملي. وتسهّل أبعاده المتوازنة استخدامه ووضعه في الغرفة. وتساعد العناية البسيطة في الحفاظ على مظهره لسنوات."),
            ),
            category = ProductCategory.STORAGE,
            price = 449.00,
            imageUrl = "https://images.unsplash.com/photo-1767963758785-b9def36c13e3?w=800&q=80",
        ),
        Product(
            id = 7,
            texts = mapOf(
                "en" to ProductText("Floor lamp", "The Floor lamp combines durable materials with a clean, practical design. Its balanced proportions make it easy to use and place in a room. Simple care helps it stay attractive for years."),
                "de" to ProductText("Stehlampe", "Der Artikel Stehlampe verbindet langlebige Materialien mit einem klaren, praktischen Design. Seine ausgewogenen Proportionen erleichtern die Nutzung und Platzierung im Raum. Mit einfacher Pflege bleibt er über Jahre ansprechend."),
                "es" to ProductText("Lámpara de pie", "El producto Lámpara de pie combina materiales duraderos con un diseño limpio y práctico. Sus proporciones equilibradas permiten usarlo y colocarlo fácilmente en una habitación. Un cuidado sencillo ayuda a mantener su buen aspecto durante años."),
                "fr" to ProductText("Lampadaire", "Le produit Lampadaire associe des matériaux durables à un design épuré et pratique. Ses proportions équilibrées facilitent son utilisation et son installation dans une pièce. Un entretien simple lui permet de rester élégant pendant des années."),
                "hi" to ProductText("फ्लोर लैंप", "यह फ्लोर लैंप टिकाऊ सामग्री और साफ़, उपयोगी डिज़ाइन का मेल है। इसका संतुलित आकार इसे कमरे में रखना और इस्तेमाल करना आसान बनाता है। साधारण देखभाल से यह वर्षों तक सुंदर बना रहता है।"),
                "id" to ProductText("Lampu lantai", "Produk Lampu lantai memadukan bahan tahan lama dengan desain bersih dan praktis. Proporsinya yang seimbang membuatnya mudah digunakan dan ditempatkan di ruangan. Perawatan sederhana membantu menjaga tampilannya selama bertahun-tahun."),
                "pt" to ProductText("Luminária de chão", "O produto Luminária de chão combina materiais duráveis com um design limpo e prático. Suas proporções equilibradas facilitam o uso e a colocação no ambiente. Cuidados simples ajudam a manter sua boa aparência por muitos anos."),
                "ar" to ProductText("مصباح أرضي", "يجمع منتج مصباح أرضي بين المواد المتينة والتصميم الأنيق والعملي. وتسهّل أبعاده المتوازنة استخدامه ووضعه في الغرفة. وتساعد العناية البسيطة في الحفاظ على مظهره لسنوات."),
            ),
            category = ProductCategory.LIGHTING,
            price = 139.00,
            imageUrl = "https://images.unsplash.com/photo-1675767528117-963ce219b52a?w=800&q=80",
        ),
        Product(
            id = 8,
            texts = mapOf(
                "en" to ProductText("Table lamp", "The Table lamp combines durable materials with a clean, practical design. Its balanced proportions make it easy to use and place in a room. Simple care helps it stay attractive for years."),
                "de" to ProductText("Tischlampe", "Der Artikel Tischlampe verbindet langlebige Materialien mit einem klaren, praktischen Design. Seine ausgewogenen Proportionen erleichtern die Nutzung und Platzierung im Raum. Mit einfacher Pflege bleibt er über Jahre ansprechend."),
                "es" to ProductText("Lámpara de mesa", "El producto Lámpara de mesa combina materiales duraderos con un diseño limpio y práctico. Sus proporciones equilibradas permiten usarlo y colocarlo fácilmente en una habitación. Un cuidado sencillo ayuda a mantener su buen aspecto durante años."),
                "fr" to ProductText("Lampe de table", "Le produit Lampe de table associe des matériaux durables à un design épuré et pratique. Ses proportions équilibrées facilitent son utilisation et son installation dans une pièce. Un entretien simple lui permet de rester élégant pendant des années."),
                "hi" to ProductText("टेबल लैंप", "यह टेबल लैंप टिकाऊ सामग्री और साफ़, उपयोगी डिज़ाइन का मेल है। इसका संतुलित आकार इसे कमरे में रखना और इस्तेमाल करना आसान बनाता है। साधारण देखभाल से यह वर्षों तक सुंदर बना रहता है।"),
                "id" to ProductText("Lampu meja", "Produk Lampu meja memadukan bahan tahan lama dengan desain bersih dan praktis. Proporsinya yang seimbang membuatnya mudah digunakan dan ditempatkan di ruangan. Perawatan sederhana membantu menjaga tampilannya selama bertahun-tahun."),
                "pt" to ProductText("Luminária de mesa", "O produto Luminária de mesa combina materiais duráveis com um design limpo e prático. Suas proporções equilibradas facilitam o uso e a colocação no ambiente. Cuidados simples ajudam a manter sua boa aparência por muitos anos."),
                "ar" to ProductText("مصباح طاولة", "يجمع منتج مصباح طاولة بين المواد المتينة والتصميم الأنيق والعملي. وتسهّل أبعاده المتوازنة استخدامه ووضعه في الغرفة. وتساعد العناية البسيطة في الحفاظ على مظهره لسنوات."),
            ),
            category = ProductCategory.LIGHTING,
            price = 79.00,
            imageUrl = "https://images.unsplash.com/photo-1580130281320-0ef0754f2bf7?w=800&q=80",
        ),
        Product(
            id = 9,
            texts = mapOf(
                "en" to ProductText("Ceramic vase", "The Ceramic vase combines durable materials with a clean, practical design. Its balanced proportions make it easy to use and place in a room. Simple care helps it stay attractive for years."),
                "de" to ProductText("Keramikvase", "Der Artikel Keramikvase verbindet langlebige Materialien mit einem klaren, praktischen Design. Seine ausgewogenen Proportionen erleichtern die Nutzung und Platzierung im Raum. Mit einfacher Pflege bleibt er über Jahre ansprechend."),
                "es" to ProductText("Jarrón de cerámica", "El producto Jarrón de cerámica combina materiales duraderos con un diseño limpio y práctico. Sus proporciones equilibradas permiten usarlo y colocarlo fácilmente en una habitación. Un cuidado sencillo ayuda a mantener su buen aspecto durante años."),
                "fr" to ProductText("Vase en céramique", "Le produit Vase en céramique associe des matériaux durables à un design épuré et pratique. Ses proportions équilibrées facilitent son utilisation et son installation dans une pièce. Un entretien simple lui permet de rester élégant pendant des années."),
                "hi" to ProductText("सिरेमिक फूलदान", "यह सिरेमिक फूलदान टिकाऊ सामग्री और साफ़, उपयोगी डिज़ाइन का मेल है। इसका संतुलित आकार इसे कमरे में रखना और इस्तेमाल करना आसान बनाता है। साधारण देखभाल से यह वर्षों तक सुंदर बना रहता है।"),
                "id" to ProductText("Vas keramik", "Produk Vas keramik memadukan bahan tahan lama dengan desain bersih dan praktis. Proporsinya yang seimbang membuatnya mudah digunakan dan ditempatkan di ruangan. Perawatan sederhana membantu menjaga tampilannya selama bertahun-tahun."),
                "pt" to ProductText("Vaso de cerâmica", "O produto Vaso de cerâmica combina materiais duráveis com um design limpo e prático. Suas proporções equilibradas facilitam o uso e a colocação no ambiente. Cuidados simples ajudam a manter sua boa aparência por muitos anos."),
                "ar" to ProductText("مزهرية خزفية", "يجمع منتج مزهرية خزفية بين المواد المتينة والتصميم الأنيق والعملي. وتسهّل أبعاده المتوازنة استخدامه ووضعه في الغرفة. وتساعد العناية البسيطة في الحفاظ على مظهره لسنوات."),
            ),
            category = ProductCategory.DECOR,
            price = 49.00,
            imageUrl = "https://images.unsplash.com/photo-1612196808214-b8e1d6145a8c?w=800&q=80",
        ),
        Product(
            id = 10,
            texts = mapOf(
                "en" to ProductText("Wall mirror", "The Wall mirror combines durable materials with a clean, practical design. Its balanced proportions make it easy to use and place in a room. Simple care helps it stay attractive for years."),
                "de" to ProductText("Wandspiegel", "Der Artikel Wandspiegel verbindet langlebige Materialien mit einem klaren, praktischen Design. Seine ausgewogenen Proportionen erleichtern die Nutzung und Platzierung im Raum. Mit einfacher Pflege bleibt er über Jahre ansprechend."),
                "es" to ProductText("Espejo de pared", "El producto Espejo de pared combina materiales duraderos con un diseño limpio y práctico. Sus proporciones equilibradas permiten usarlo y colocarlo fácilmente en una habitación. Un cuidado sencillo ayuda a mantener su buen aspecto durante años."),
                "fr" to ProductText("Miroir mural", "Le produit Miroir mural associe des matériaux durables à un design épuré et pratique. Ses proportions équilibrées facilitent son utilisation et son installation dans une pièce. Un entretien simple lui permet de rester élégant pendant des années."),
                "hi" to ProductText("दीवार का आईना", "यह दीवार का आईना टिकाऊ सामग्री और साफ़, उपयोगी डिज़ाइन का मेल है। इसका संतुलित आकार इसे कमरे में रखना और इस्तेमाल करना आसान बनाता है। साधारण देखभाल से यह वर्षों तक सुंदर बना रहता है।"),
                "id" to ProductText("Cermin dinding", "Produk Cermin dinding memadukan bahan tahan lama dengan desain bersih dan praktis. Proporsinya yang seimbang membuatnya mudah digunakan dan ditempatkan di ruangan. Perawatan sederhana membantu menjaga tampilannya selama bertahun-tahun."),
                "pt" to ProductText("Espelho de parede", "O produto Espelho de parede combina materiais duráveis com um design limpo e prático. Suas proporções equilibradas facilitam o uso e a colocação no ambiente. Cuidados simples ajudam a manter sua boa aparência por muitos anos."),
                "ar" to ProductText("مرآة حائط", "يجمع منتج مرآة حائط بين المواد المتينة والتصميم الأنيق والعملي. وتسهّل أبعاده المتوازنة استخدامه ووضعه في الغرفة. وتساعد العناية البسيطة في الحفاظ على مظهره لسنوات."),
            ),
            category = ProductCategory.DECOR,
            price = 159.00,
            imageUrl = "https://images.unsplash.com/photo-1618220252344-8ec99ec624b1?w=800&q=80",
        ),
    )

    fun observeById(id: Int): Flow<Product?> {
        val item = products.find { it.id == id }
        return flowOf(item)
    }

    fun getById(id: Int): Product? {
        return products.find { it.id == id }
    }

    fun observeAll(): Flow<List<Product>> {
        return flowOf(products)
    }
}
