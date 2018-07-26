package cartas

    open class test_Cartas(val id: Int, val nome: String)

    open class Monstros(id: Int, nome: String, val nivel: Int, val tesouro: Int) : test_Cartas(id, nome)
    open class Personagens(id: Int, nome: String, val tipo: String, val ativo: Boolean) : test_Cartas(id, nome)
    open class Maldicao(id: Int, nome: String, val tipo: String, val ativo: Boolean) : test_Cartas(id, nome)
    open class ArmasArmaduras(id: Int, nome: String, val ondeEquipar: String, val qtsMaos: Int, val itemGrande: Boolean, val bonus: Int, val valor: Int, val ativo: Boolean) : test_Cartas(id, nome)
    open class Itens(id: Int, nome: String, val tipo: String, val bonus: Int, val valor: Int, val ativo: Boolean) : test_Cartas(id, nome)
    open class OutrosTesouros(id: Int, nome: String, val tipo: String, val bonus: Int, val valor: Int, val ativo: Boolean) : test_Cartas(id, nome)

    fun cartasDeMonstro(cartas: ArrayList<test_Cartas>) {
        cartas.add(Monstros(1, "CARRAPATOS", 1, 1))
        cartas.add(Monstros(2, "GOBLIN_ALEIJADO", 1, 1))
        cartas.add(Monstros(3, "GOSMA_GRUDENTA", 1, 1))
        cartas.add(Monstros(4, "RATRICINHA_COM_PORRETE", 1, 1))
        cartas.add(Monstros(5, "VASO_DE_PLANTA", 1, 1))
        cartas.add(Monstros(6, "GALINHA_ANABOLIZADA", 2, 1))
        cartas.add(Monstros(7, "JOAO_DO_CAIXAO", 2, 1))
        cartas.add(Monstros(8, "OCTAEDRO_GELATINOSO", 2, 1))
        cartas.add(Monstros(9, "PIT_BULL", 2, 1))
        cartas.add(Monstros(10, "CAVALO_ZUMBI", 4, 2))
        cartas.add(Monstros(11, "DUENDE_LEPROSO", 4, 2))
        cartas.add(Monstros(12, "HARPIAS", 4, 2))
        cartas.add(Monstros(13, "LEZMAS_VELOZES", 4, 2))
        cartas.add(Monstros(14, "ADVOGADOS", 6, 2))
        cartas.add(Monstros(15, "GORFOMON", 6, 2))
        cartas.add(Monstros(16, "MANTICORNITORRINCO", 6, 2))
        cartas.add(Monstros(17, "NERD_HISTERICO", 6, 2))
        cartas.add(Monstros(18, "AMAZONA", 8, 2))
        cartas.add(Monstros(19, "CHUPA_CARA", 8, 2))
        cartas.add(Monstros(20, "CORETO_ATERRORIZANTE", 8, 2))
        cartas.add(Monstros(21, "NOIVAMPIRAS", 8, 2))
        cartas.add(Monstros(22, "3.872_ORCS", 10, 3))
        cartas.add(Monstros(23, "NARIZ_FLUTUANTE", 10, 3))
        cartas.add(Monstros(24, "TROLL_DA_INTERNET", 10, 3))
        cartas.add(Monstros(25, "DEMONIA_LINGUARUDA", 12, 3))
        cartas.add(Monstros(26, "PAGA_PAU_DE_VAMPIRO", 12, 3))
        cartas.add(Monstros(27, "PE_GRANDE", 12, 3))
        cartas.add(Monstros(28, "GOLEM_DE_PEDRA", 14, 4))
        cartas.add(Monstros(29, "HORROR_ATERRORIZANTE_INDESCRITIVELMENTE_INDESCRITIVEL", 14, 4))
        cartas.add(Monstros(30, "VENDEDOR_DE_SEGUROS", 14, 4))
        cartas.add(Monstros(31, "HIPOGRIFO", 16, 4))
        cartas.add(Monstros(32, "REI_TUT", 16, 4))
        cartas.add(Monstros(33, "TIBIO_E_PERONIO_CIRURGIA_ORTOPEDICA", 16, 4))
        cartas.add(Monstros(34, "BALROG", 18, 5))
        cartas.add(Monstros(35, "POLVOZILLA", 18, 4))
        cartas.add(Monstros(36, "DRAGAO_DE_PLUTONIO", 20, 5))

        cartas.add(Personagens(37, "CLERIGO_01", "Classe", false))
        cartas.add(Personagens(38, "CLERIGO_02", "Classe", false))
        cartas.add(Personagens(39, "CLERIGO_03", "Classe", false))
        cartas.add(Personagens(40, "GUERREIRO_01", "Classe", false))
        cartas.add(Personagens(41, "GUERREIRO_02", "Classe", false))
        cartas.add(Personagens(42, "GUERREIRO_03", "Classe", false))
        cartas.add(Personagens(43, "LADRAO_01", "Classe", false))
        cartas.add(Personagens(44, "LADRAO_02", "Classe", false))
        cartas.add(Personagens(45, "LADRAO_03", "Classe", false))
        cartas.add(Personagens(46, "MAGO_01", "Classe", false))
        cartas.add(Personagens(47, "MAGO_02", "Classe", false))
        cartas.add(Personagens(48, "MAGO_03", "Classe", false))
        cartas.add(Personagens(49, "SUPER_MUNCHKIN_01", "ClasseMix", false))
        cartas.add(Personagens(50, "SUPER_MUNCHKIN_02", "ClasseMix", false))
        cartas.add(Personagens(51, "ANAO_01", "Raca", false))
        cartas.add(Personagens(52, "ANAO_02", "Raca", false))
        cartas.add(Personagens(53, "ANAO_03", "Raca", false))
        cartas.add(Personagens(54, "ELFO_01", "Raca", false))
        cartas.add(Personagens(55, "ELFO_02", "Raca", false))
        cartas.add(Personagens(56, "ELFO_03", "Raca", false))
        cartas.add(Personagens(57, "HALFING_01", "Raca", false))
        cartas.add(Personagens(58, "HALFING_02", "Raca", false))
        cartas.add(Personagens(59, "HALFING_03", "Raca", false))
        cartas.add(Personagens(60, "MESTICO_01", "RacaMix", false))
        cartas.add(Personagens(61, "MESTICO_02", "RacaMix", false))

        cartas.add(Maldicao(62, "ESPELHO_MAGICO", "Maldicao", false))
        cartas.add(Maldicao(63, "GALINHA_NA_CABECA", "Maldicao", false))
        cartas.add(Maldicao(64, "IMPOSTO_DE_RENDA", "Maldicao", false))
        cartas.add(Maldicao(65, "MUDANCA_DE_CLASSE", "Maldicao", false))
        cartas.add(Maldicao(66, "MUDANCA_DE_RACA", "Maldicao", false))
        cartas.add(Maldicao(67, "MUDANCA_DE_SEXO", "Maldicao", false))
        cartas.add(Maldicao(68, "PATO_DO_APOCALIPSE", "Maldicao", false))
        cartas.add(Maldicao(69, "PERCA_1_ITEM_GRANDE", "Maldicao", false))
        cartas.add(Maldicao(70, "PERCA_1_ITEM_PEQUENO_01", "Maldicao", false))
        cartas.add(Maldicao(71, "PERCA_1_ITEM_PEQUENO_02", "Maldicao", false))
        cartas.add(Maldicao(72, "PERCA_1_NIVEL_01", "Maldicao", false))
        cartas.add(Maldicao(73, "PERCA_1_NIVEL_02", "Maldicao", false))
        cartas.add(Maldicao(74, "PERCA_2_CARTAS", "Maldicao", false))
        cartas.add(Maldicao(75, "PERCA_A_ARMADURA_QUE_ESTIVER_USANDO", "Maldicao", false))
        cartas.add(Maldicao(76, "PERCA_OS_CALCADOS_QUE_ESTIVER_USANDO", "Maldicao", false))
        cartas.add(Maldicao(77, "PERCA_QUALQUER_COISA_QUE_ESTIVER_USANDO_NA_CABECA", "Maldicao", false))
        cartas.add(Maldicao(78, "PERCA_SUA_CLASSE", "Maldicao", false))
        cartas.add(Maldicao(79, "PERCA_SUA_RACA_01", "Maldicao", false))
        cartas.add(Maldicao(80, "PERCA_SUA_RACA_02", "Maldicao", false))
        cartas.add(Maldicao(81, "REALMENTE_IRRITANTE", "Maldicao", false))
        cartas.add(Maldicao(82, "AMIGUINHO", "Alteracao", false))
        cartas.add(Maldicao(83, "ANCIAO", "Alteracao", false))
        cartas.add(Maldicao(84, "BEBE", "Alteracao", false))
        cartas.add(Maldicao(85, "DA_UMA_MAOZINHA", "Alteracao", false))
        cartas.add(Maldicao(86, "EM_FURIA", "Alteracao", false))
        cartas.add(Maldicao(87, "EM_HORARIO_DE_ALMOCO", "Alteracao", false))
        cartas.add(Maldicao(88, "ILUSAO", "Alteracao", false))
        cartas.add(Maldicao(89, "IMENSO", "Alteracao", false))
        cartas.add(Maldicao(90, "INTELIGENTE", "Alteracao", false))
        cartas.add(Maldicao(91, "INTERVENCAO_DIVINA", "Alteracao", false))
        cartas.add(Maldicao(92, "ISSO_E_TRAPACA", "Alteracao", false))
        cartas.add(Maldicao(93, "MONSTRO_ERRANTE_01", "Alteracao", false))
        cartas.add(Maldicao(94, "MONSTRO_ERRANTE_02", "Alteracao", false))
        cartas.add(Maldicao(95, "MONSTRO_ERRANTE_03", "Alteracao", false))

        cartas.add(ArmasArmaduras(96, "ADAGA_DA_TRAICAO", "Maos", 1, false, 3, 400, false))
        cartas.add(ArmasArmaduras(97, "ALABARDA_SUICA", "Maos", 2, true, 4, 600, false))
        cartas.add(ArmasArmaduras(98, "ARCO_COM_FITINHAS", "Maos", 2, false, 4, 800, false))
        cartas.add(ArmasArmaduras(99, "ARMADURA_DE_COURO", "Corpo", 0, false, 1, 200, false))
        cartas.add(ArmasArmaduras(100, "ARMADURA_DE_MITHRIL", "Corpo", 0, false, 3, 600, false))
        cartas.add(ArmasArmaduras(101, "ARMADURA_FLAMEJANTE", "Corpo", 0, false, 2, 400, false))
        cartas.add(ArmasArmaduras(102, "ARMADURA_PEGAJOSA", "Corpo", 0, false, 1, 200, false))
        cartas.add(ArmasArmaduras(103, "ARMADURA_RECHONCHUDA", "Corpo", 0, false, 3, 400, false))
        cartas.add(ArmasArmaduras(104, "BANDANA_DE_MACHAO", "Cabeca", 0, false, 3, 400, false))
        cartas.add(ArmasArmaduras(105, "BOTAS_DE_CHUTAR_A_BUNDA", "Pes", 0, false, 2, 400, false))
        cartas.add(ArmasArmaduras(106, "BOTAS_PARA_CORRER_MUITO_RAPIDO", "Pes", 0, false, 0, 400, false))
        cartas.add(ArmasArmaduras(107, "BROQUEL_DA_BRAVATA", "Maos", 1, false, 2, 400, false))
        cartas.add(ArmasArmaduras(108, "CACETE_DO_COMPLEXO_DE_INFERIORIDADE", "Maos", 1, false, 3, 400, false))
        cartas.add(ArmasArmaduras(109, "CAJADO_DE_NAPALM", "Maos", 1, false, 5, 800, false))
        cartas.add(ArmasArmaduras(110, "CHAPEU_DE_BRUXO_DO_PODER", "Cabeca", 0, false, 3, 400, false))
        cartas.add(ArmasArmaduras(111, "ELMO_CHIFRUDO", "Cabeca", 0, false, 1, 600, false)) //Bonus +3 se for Elfo
        cartas.add(ArmasArmaduras(112, "ELMO_DA_CORAGEM", "Cabeca", 0, false, 1, 200, false))
        cartas.add(ArmasArmaduras(113, "ESCADA_DE_MAO", "Outros", 0, true, 3, 400, false))
        cartas.add(ArmasArmaduras(114, "ESCUDO_ONIPRESENTE", "Maos", 1, true, 4, 600, false))
        cartas.add(ArmasArmaduras(115, "ESPADA_BASTARDA_TRAICOEIRA", "Maos", 1, false, 2, 400, false))
        cartas.add(ArmasArmaduras(116, "ESPADA_QUE_CANTA_E_DANCA", "Outros", 0, false, 2, 400, false))
        cartas.add(ArmasArmaduras(117, "ESPA-DONA", "Maos", 1, false, 3, 400, false))
        cartas.add(ArmasArmaduras(118, "ESPETINHO_DE_RATO", "Maos", 1, false, 1, 0, false))
        cartas.add(ArmasArmaduras(119, "FLORETE_DA_INJUSTICA", "Maos", 1, false, 3, 600, false))
        cartas.add(ArmasArmaduras(120, "HAMBURGUER_DE_CADAVERES_COM_ANCHOVAS", "Outros", 0, false, 3, 400, false))
        cartas.add(ArmasArmaduras(121, "JOELHEIRAS_DA_SEDUCAO", "Joelho", 0, false, 0, 600, false))
        cartas.add(ArmasArmaduras(122, "JOELHEIRAS_PONTIAGUDAS", "Joelho", 0, false, 1, 200, false))
        cartas.add(ArmasArmaduras(123, "LANCA_MUITO_GRANDE", "Maos", 2, false, 1, 200, false))
        cartas.add(ArmasArmaduras(124, "MACA_AFIADA", "Maos", 1, false, 4, 600, false))
        cartas.add(ArmasArmaduras(125, "MANTO_DAS_SOMBRAS", "Outros", 0, false, 4, 600, false))
        cartas.add(ArmasArmaduras(126, "MARTELO_DETONA_JOELHO", "Maos", 1, false, 4, 600, false))
        cartas.add(ArmasArmaduras(127, "MEIA_CALCA_DA_FORCA_DO_GIGANTE", "Outros", 0, false, 3, 600, false))
        cartas.add(ArmasArmaduras(128, "PEDRA_GIGANTE", "Maos", 2, true, 3, 0, false))
        cartas.add(ArmasArmaduras(129, "RALADOR_DE_QUEIJO_DA_PAZ", "Maos", 1, false, 3, 400, false))
        cartas.add(ArmasArmaduras(130, "SANDALIAS_DA_PROTECAO", "Pes", 0, false, 0, 700, false))
        cartas.add(ArmasArmaduras(131, "SERRA_ELETRICA_DA_MUTILACAO_SANGRENTA", "Maos", 2, true, 3, 600, false))
        cartas.add(ArmasArmaduras(132, "TITULO_REALMENTE_IMPRESSIONANTE", "Outros", 0, false, 3, 0, false))
        cartas.add(ArmasArmaduras(133, "TUBA_ENCANTADA", "Maos", 1, true, 0, 300, false))

        cartas.add(Itens(134, "AGUA_MINERAL_DE_MARCA", "Item", 2, 100, false))
        cartas.add(Itens(135, "ANEL_DO_DESEJO_01", "Item", 0, 500, false))
        cartas.add(Itens(136, "ANEL_DO_DESEJO_02", "Item", 0, 500, false))
        cartas.add(Itens(137, "BARREIRA_INSTANTANEA", "Item", 0, 300, false))
        cartas.add(Itens(138, "BEXIGAS_BONITINHAS", "Item", 5, 0, false))
        cartas.add(Itens(139, "COCAO_DE_PONFUSAO", "Item", 3, 100, false))
        cartas.add(Itens(140, "DADO_VICIADO", "Item", 0, 300, false))
        cartas.add(Itens(141, "DOPPELGANGER", "Item", 0, 300, false))
        cartas.add(Itens(142, "ISOTONICO_SABOR_ENXOFRE", "Item", 2, 200, false))
        cartas.add(Itens(143, "LAMPADA_MAGICA", "Item", 0, 500, false))
        cartas.add(Itens(144, "MISSIL_MAGICO", "Item", 5, 300, false))
        cartas.add(Itens(145, "POCAO_ACIDA_ELETRORRADIOATIVA", "Item", 5, 200, false))
        cartas.add(Itens(146, "POCAO_DA_AMIZADE", "Item", 0, 200, false))
        cartas.add(Itens(147, "POCAO_DA_CORAGEM_ESTUPIDA", "Item", 2, 100, false))
        cartas.add(Itens(148, "POCAO_DA_TRANSFERENCIA", "Item", 0, 300, false))
        cartas.add(Itens(149, "POCAO_DE_HALITOSE", "Item", 2, 100, false))
        cartas.add(Itens(150, "POCAO_DE_INVISIBILIDADE", "Item", 0, 200, false))
        cartas.add(Itens(151, "POCAO_DE_POLIMORFISMO", "Item", 0, 1300, false))
        cartas.add(Itens(152, "POCAO_DE_VENENO_FLAMEJANTE", "Item", 3, 100, false))
        cartas.add(Itens(153, "POCAO_DO_SONO", "Item", 2, 100, false))
        cartas.add(Itens(154, "POCAO_EXPLOSIVA_CONGELANTE", "Item", 3, 100, false))
        cartas.add(Itens(155, "TUBO_DE_COLA", "Item", 0, 100, false))
        cartas.add(Itens(156, "VARINHA_DE_ZAHORI", "Item", 0, 1100, false))

        cartas.add(OutrosTesouros(157, "1.000_PECAS_DE_OURO", "Outros Tesouros", 0, 1000, false))
        cartas.add(OutrosTesouros(158, "CHORAMINGAR_COM_O_MESTRE", "Outros Tesouros", 0, 1000, false))
        cartas.add(OutrosTesouros(159, "ERRO_DE_SOMA_CONVENIENTE", "Outros Tesouros", 0, 1000, false))
        cartas.add(OutrosTesouros(160, "ESCUDEIRO_FIEL", "Outros Tesouros", 1, 0, false))
        cartas.add(OutrosTesouros(161, "INVOCAR_REGRAS_OBSCURAS", "Outros Tesouros", 0, 1000, false))
        cartas.add(OutrosTesouros(162, "MASSACRE_DE_FORMIGAS_COM_AGUA_FERVENDO", "Outros Tesouros", 0, 1000, false))
        cartas.add(OutrosTesouros(163, "MATAR_O_ESCUDEIRO", "Outros Tesouros", 0, 1000, false))
        cartas.add(OutrosTesouros(164, "MUTILAR_OS_CADAVERES", "Outros Tesouros", 0, 1000, false))
        cartas.add(OutrosTesouros(165, "POCAO_DE_VIRAR_MACHO", "Outros Tesouros", 0, 1000, false))
        cartas.add(OutrosTesouros(166, "ROUBAR_1_NIVEL", "Outros Tesouros", 0, 1000, false))
        cartas.add(OutrosTesouros(167, "SUBORNAR_O_MESTRE_COM_COMIDA", "Outros Tesouros", 0, 1000, false))
        cartas.add(OutrosTesouros(168, "TESOUROS", "Outros Tesouros", 0, 0, false))
    }








