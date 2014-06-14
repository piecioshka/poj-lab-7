# poj-lab-7

Zadanie polega na wczytaniu pliku "input.html", a następnie zapisaniu
odczytanej i zdekorowanej zawartości do pliku o innej nazwie. Proszę więc
utworzył następujące dekoratory dla strumienia wyjściowego:

	1.	określone słowo zostanie wytłuszczone
	2.	określone słowo zostanie pochylone
	3.	po zapianiu wszystkich bajtów do pliku, na ekranie zostanie wypisana
		liczba wystąpienia określonego słowa
	
Po wykonaniu dekoratorów, proszę pokazać ich działanie w następujących scenariuszach:

	1.	kopiowanie zawartości pliku bez dekorowania
	2.	kopiowanie zawartości pliku z dekoratorem nr 1 dla słowa "BeBe"
	3.	kopiowanie zawartości pliku z dekoratorem nr 1 i 2 dla słowa "BeBe"
	4.	kopiowanie zawartości pliku z dekoratorem nr 2 i 1 (uwaga! zmiana
		kolejności wywołania dekoratorów) dla słowa "BeBe"
		*	proszę zauważyć, że kolejność wpisywania tagów <i> oraz <b> uległa
			zmianie w porównaniu z wersją nr 3
	5.	kopiowanie zawartości pliku z dekoratorem nr 1 i 2 dla słowa "BeBe"
		oraz jeszcze raz 2 dla słowa "bankierów"
	6.	kopiowanie zawartości pliku z dekoratorem nr 1, 2 oraz 3 dla s�owa
		"BeBe" oraz jeszcze raz 2 dla słowa "bankierów"
