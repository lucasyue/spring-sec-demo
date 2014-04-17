package mvc.resolver;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Chunk;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;

@Component("bnResolver1")
public class BeanNamePdfView1 extends AbstractPdfView {
	protected void buildPdfDocument(java.util.Map<String, Object> model,
			com.lowagie.text.Document document,
			com.lowagie.text.pdf.PdfWriter writer,
			javax.servlet.http.HttpServletRequest request,
			javax.servlet.http.HttpServletResponse response) throws Exception {
		Chunk c1 = new Chunk("chunk1");
		Chunk c2 = new Chunk("chunk2");
		document.add(c1);
		document.add(Chunk.NEWLINE);// 会从头开始
		document.add(c2);

		Paragraph p1 = new Paragraph("paragraph1");
		Paragraph p2 = new Paragraph(new Chunk("paragraph2 chunk1"));
		document.add(p1);
		document.add(p2);

		document.add(Chunk.NEXTPAGE);
		Phrase phr1 = new Phrase();
		Chunk cp1 = new Chunk("phrase1-chunk1");
		Chunk cp2 = new Chunk("phrase1-chunk2");
		phr1.add(cp1);
		phr1.add(cp2);

		Phrase phr2 = new Phrase();
		Chunk cp21 = new Chunk("phrase2-chunk1");
		Chunk cp22 = new Chunk("phrase2-chunk2");
		phr2.add(cp21);
		phr2.add("\n");// 换行
		phr2.add(cp22);
		document.add(phr1);
		// document.add(Chunk.NEWLINE);// 不再从头开始，而是换行
		document.add(phr2);

	};
}
