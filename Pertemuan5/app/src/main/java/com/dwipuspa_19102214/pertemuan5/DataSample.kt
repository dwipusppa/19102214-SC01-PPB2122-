package com.dwipuspa_19102214.pertemuan5

object DataSample {
    private val namasampel = arrayOf(
        "Baturaden",
        "Small world",
        "Watu meja"
    )
    private val deskripsisampel = arrayOf(
        "Desa wisata yang ada di Banyumas",
        "Miniatur dunia",
        "Pemandangan indah atas bukit"
    )
    private val gambarsampel = intArrayOf(
        R.drawable.baturaden_1,
        R.drawable.smallworld_1,
        R.drawable.watu_meja1
    )
    private val latsampel = doubleArrayOf(
        -7.3228088,
        -7.3327697,
        -7.5190073
    )
    private val longsampel = doubleArrayOf(
        109.1504183,
        109.2229267,
        109.2123145
    )
    val listData :ArrayList<DataClassWisata>
    get(){
        val listDataku = arrayListOf<DataClassWisata>()
        for (position in namasampel.indices){
            val data = DataClassWisata()
            data.namawisata = namasampel[position]
            data.deskripsi = deskripsisampel[position]
            data.sampleimage= gambarsampel[position]
            data.lat = latsampel[position]
            data.long= longsampel[position]
            listDataku.add(data)
        }
        return listDataku
    }
}

