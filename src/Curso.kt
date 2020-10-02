class Curso{
    var nomeCurso: String? = ""
    var codigoCurso: Int? = 0
    lateinit var professorTitular: ProfessorTitular
    lateinit var professorAdjunto: ProfessorAdjunto
    var qtdeMaxAluno: Int? = 0
    var listaAlunoMatriculado = mutableListOf<Aluno>()

    fun adicionarUmAluno(aluno : Aluno) : Boolean {
        var qtdeAluno = listaAlunoMatriculado.size

        this.qtdeMaxAluno?.let{
            if(it > qtdeAluno)
            {
                listaAlunoMatriculado.add(aluno)
                return true
            }
        }

        return false
    }

    fun excluirAluno(aluno: Aluno){

        listaAlunoMatriculado.forEach{
            if(it.codigoAluno == aluno.codigoAluno){
                listaAlunoMatriculado.remove(aluno)
            }
        }
    }
}