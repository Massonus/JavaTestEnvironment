package org.test.pLesson37.p4;

import com.test.pLesson37.User;
import com.test.pLesson37.UserRepository;
import com.test.pLesson37.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

class UserServiceTest {

    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        this.userService = new UserService(userRepository);
    }

    @Test
    void checkUserPresence_should_return_true() throws Exception {
        given(userRepository.getUserByUsername("user")).willReturn(
                new User("user"));

        boolean userExist = userService.checkUserPresence(new User("user"));
        assertTrue(userExist);

        verify(userRepository).getUserByUsername("user");
    }

    @Test
    void checkUserPresence_should_return_Null() throws Exception {
        given(userRepository.getUserByUsername("user")).willReturn(null);

        boolean userExist = userService.checkUserPresence(new User("user"));
        assertFalse(userExist);
    }

    @Test
    void checkUserPresence_should_throw_Exception() throws Exception {
        given(userRepository.getUserByUsername(anyString())).willThrow(Exception.class);

        assertThrows(Exception.class, () -> {
            userService.checkUserPresence(new User("user"));
        });
    }

    @Test
    void testCaptor() throws Exception {
        given(userRepository.getUserByUsername("user")).willReturn(
                new User("user"));

        boolean user = userService.checkUserPresence(new User("user"));

        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);

        verify(userRepository).getUserByUsername(captor.capture());

        String argument = captor.getValue();

        assertEquals(argument, "user");
    }

    @Test
    void whenAddCalledAnswered() {
        List<String> myList = mock(List.class);
        doAnswer(invocation -> {
            Object arg0 = invocation.getArgument(0);
            Object arg1 = invocation.getArgument(1);

            assertEquals(3, arg0);
            assertEquals("answer me", arg1);
            return null;
        }).when(myList).add(any(Integer.class), any(String.class));
        myList.add(3, "answer me");
    }

    @Test
    void his() {
        User user = Mockito.mock(User.class);
        when(user.getUsername()).thenReturn("Casper");
           /*assertEquals(user.getUsername(), "Casper");*/
        doReturn("true").when(user).getUsername();
        assertEquals(user.getUsername(), "Casper");
    }

}