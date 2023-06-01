package in.rai.backend.SpringBootApp;

import in.rai.backend.SpringBootApp.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.web.servlet.MockMvc;

//@SpringBootTest(properties = {"spring.main.allow-bean-definition-overriding=true"})
@AutoConfigureMockMvc
class IntegrationTest {

    @MockBean
    BookRepository bookRepository;
    //    @Autowired
//    private WebApplicationContext webApplicationContext;
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private MongoTemplate mongoTemplate;


    @BeforeEach
    public void setup() throws Exception {
        ;
//        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }

//    @Test
//    void contextLoads() throws Exception {
//        Book book = new Book();
//        book.setId(1);
//        book.setBookName("book_test");
//        book.setAuthorName("joe");
//        ObjectMapper objectMapper = new ObjectMapper();
//        String jsonString = objectMapper.writeValueAsString(book);
//
//
//        when(bookRepository.save(any(Book.class))).thenReturn(book);
//
//        mockMvc.perform(post("/add-book").contentType(MediaType.APPLICATION_JSON).content(jsonString))
//                .andDo(print())
//                .andExpect(status().is2xxSuccessful());
//
//
//    }
//
//    @Test
//    public void givenWac_whenServletContext_thenItProvidesGreetController() throws Exception {
////        ServletContext servletContext = webApplicationContext.getServletContext();
////
////        assertThat(servletContext).isNotNull();
////        assertThat(servletContext).isInstanceOf(MockServletContext.class);
////
////        this.mockMvc.perform(get("/home")).andDo(print());
////        Assert.assertNotNull(servletContext);
////        Assert.assertTrue(servletContext instanceof MockServletContext);
////        Assert.assertNotNull(webApplicationContext.getBean("greetController"));
//    }


}